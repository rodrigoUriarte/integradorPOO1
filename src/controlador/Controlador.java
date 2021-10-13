/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import dao.Persistencia;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import modelo.domain.*;

/**
 *
 * @author claudio Clase que interactua con la vista y la capa de persistencia.
 * Funciona como una capa de servicios (es posible desacoplar en dos capas).
 *
 * Idea: UI -- Controlador -- Persistencia (DAO) -- Modelo
 *
 * En aplicaciones complejas: UI -- Controlador -- Servicio -- Persistencia
 * (DAO) -- Modelo
 *
 * Existen situaciones que se usan servicios y DAOs por cada clase del modelo.
 *
 * Con JPA la parte de Persistencia se puede obviar o armar un DAO genérico. En
 * este proyecto se usa un DAO genérico (Clase Persistencia).
 *
 * Esta NO ES una implementacion de controlador cuya tarea es capturar acciones
 * de las vistas.
 *
 */
public class Controlador {

    Persistencia persistencia;

    public Controlador(Persistencia p) {
        this.persistencia = p;
    }

    public List listarTripulante() {
        // retorno valores ordenados de la consulta
        return this.persistencia.buscarTodos(Tripulante.class);
    }

    public Tripulante buscarTripulante(Long id) {
        return this.persistencia.buscar(Tripulante.class, id);
    }

    public void agregarTripulante(String nombre, String apellido, String telefono, String email, Date fnac, List<TipoAeronave> tipoAeronaves, List<Vuelo> vueloes) {
        this.persistencia.iniciarTransaccion();
        Tripulante t = new Tripulante(nombre.toUpperCase(), apellido.toUpperCase(), telefono.toUpperCase(), email.toUpperCase(), fnac, tipoAeronaves, vueloes);
        this.persistencia.insertar(t);
        this.persistencia.confirmarTransaccion();

    }

    public void editarTripulante(Tripulante t, String nombre, String apellido, String telefono, String email, Date fnac, List<TipoAeronave> tipoAeronaves, List<Vuelo> vueloes) {
        if (t != null) {
            this.persistencia.iniciarTransaccion();
            t.setNombre(nombre.toUpperCase());
            t.setApellido(apellido.toUpperCase());
            t.setTelefono(telefono.toUpperCase());
            t.setEmail(email.toUpperCase());
            t.setFnac(fnac);
            t.setTipoAeronaves(tipoAeronaves);
            t.setVueloes(vueloes);
            this.persistencia.modificar(t);
            this.persistencia.confirmarTransaccion();
        }
    }

    public int eliminarTripulante(Tripulante t) {
        if (t.getVueloes().isEmpty()) {
            this.persistencia.iniciarTransaccion();
            List<TipoAeronave> tA = t.getTipoAeronaves();
            Iterator<TipoAeronave> it = tA.iterator();
            while (it.hasNext()) {
                TipoAeronave ta = it.next();
                it.remove();
                this.persistencia.modificar(ta);
            }

            /**
             * for (TipoAeronave ta : tA) { t.removeTipoAeronafe(ta); }
             */
            
            //this.persistencia.modificar(tA);
            this.persistencia.eliminar(t);
            this.persistencia.confirmarTransaccion();
            return 0;
        } else {
            return 1;
        }
    }

    public void agregarTipoAeronaveTripulante(Tripulante t, TipoAeronave ta) {
        this.persistencia.iniciarTransaccion();
        t.addTipoAeronafe(ta);
        this.persistencia.modificar(t);
        this.persistencia.confirmarTransaccion();
    }

    public void agregarVueloTripulante(Tripulante t, Vuelo v) {
        this.persistencia.iniciarTransaccion();
        v.addTripulante(t);
        this.persistencia.modificar(t);
        this.persistencia.confirmarTransaccion();
    }

    public void removerTipoAeronaveTripulante(Tripulante t, TipoAeronave ta) {
        this.persistencia.iniciarTransaccion();
        t.removeTipoAeronafe(ta);
        this.persistencia.modificar(t);
        this.persistencia.modificar(ta);
        this.persistencia.confirmarTransaccion();
    }

    public void removerVueloTripulante(Tripulante t, Vuelo v) {
        this.persistencia.iniciarTransaccion();
        v.removeTripulante(t);
        this.persistencia.modificar(t);
        this.persistencia.modificar(v);
        this.persistencia.confirmarTransaccion();
    }

    public List listarVuelos() {
        return this.persistencia.buscarTodos(Vuelo.class);
    }

    public Vuelo buscarVuelo(Long id) {
        return this.persistencia.buscar(Vuelo.class, id);
    }

    public Vuelo buscarODF(String origen, String destino, Date fecha) {
        return this.persistencia.buscarODF(Vuelo.class, origen, destino, fecha);
    }

    public void agregarVuelo(String origen, String destino, Date fechaSalida, Date fechaArribo, int distancia, Aeronave aeronave, List<Reserva> reservas, List<Tripulante> tripulantes) {
        this.persistencia.iniciarTransaccion();
        Vuelo v = new Vuelo(origen.toUpperCase(), destino.toUpperCase(), fechaSalida, fechaArribo, distancia, aeronave, reservas, tripulantes);
        aeronave.getVueloes().add(v);
        this.persistencia.insertar(v);
        this.persistencia.confirmarTransaccion();
    }

    public void editarVuelo(Vuelo v, String origen, String destino, Date fechaSalida, Date fechaArribo, int distancia, Aeronave aeronave, List<Reserva> reservas, List<Tripulante> tripulantes) {
        this.persistencia.iniciarTransaccion();
        v.setOrigen(origen.toUpperCase());
        v.setDestino(destino.toUpperCase());
        v.setFechaSalida(fechaSalida);
        v.setFechaArribo(fechaArribo);
        v.setDistancia(distancia);
        v.setAeronave(aeronave);
        v.setReservas(reservas);
        v.setTripulantes(tripulantes);
        this.persistencia.modificar(v);
        this.persistencia.confirmarTransaccion();
    }

    public int eliminarVuelo(Vuelo v, List<Tripulante> t) {
        if (v.getReservas().isEmpty()) {
            this.persistencia.iniciarTransaccion();
            
            
            for (Tripulante tripulante:t){
                //v.removeTripulante(tripulante);
                tripulante.removeVuelo(v);
                this.persistencia.modificar(tripulante);
            }
            
            /*
            Iterator<Tripulante> it = t.iterator();
            while (it.hasNext()) {
                Tripulante tr = it.next();
                it.remove();
                this.persistencia.modificar(tr);
            }
            */
            this.persistencia.eliminar(v);
            this.persistencia.confirmarTransaccion();
            return 0;
        } else {
            return 1;

        }
    }

    public List listarTipoAeronave() {
        return this.persistencia.buscarTodos(TipoAeronave.class);
    }

    public TipoAeronave buscarTipoAeronave(Long id) {
        return this.persistencia.buscar(TipoAeronave.class, id);
    }

    public void agregarTipoAeronave(String descripcion, List<Aeronave> aeronaves, List<Tripulante> tripulantes) {
        this.persistencia.iniciarTransaccion();
        TipoAeronave ta = new TipoAeronave(descripcion.toUpperCase(), aeronaves, tripulantes);
        this.persistencia.insertar(ta);
        this.persistencia.confirmarTransaccion();
    }

    public void editarTipoAeronave(TipoAeronave ta, String descripcion, List<Aeronave> aeronaves, List<Tripulante> tripulantes) {
        this.persistencia.iniciarTransaccion();
        ta.setDescripcion(descripcion);
        ta.setAeronaves(aeronaves);
        ta.setTripulantes(tripulantes);
        this.persistencia.modificar(ta);
        this.persistencia.confirmarTransaccion();
    }

    public int eliminarTipoAeronave(TipoAeronave ta) {
        if (ta.getTripulantes().isEmpty()) {//verifico que ningun tripulante tenga esta capacitacion
            this.persistencia.iniciarTransaccion();
            this.persistencia.eliminar(ta);//la lista de tripulantes esta vacia y la lista de aeronaves se elimina mediante CASCADA
            this.persistencia.confirmarTransaccion();
            return 0;
        } else {
            return 1;
        }
    }

    public List listarAeronave() {
        return this.persistencia.buscarTodos(Aeronave.class);
    }

    public Aeronave buscarAeronave(Long id) {
        return this.persistencia.buscar(Aeronave.class, id);
    }

    public void agregarAeronave(String fabricante, String modelo, TipoAeronave tipoAeronave, List<Vuelo> vueloes) {
        this.persistencia.iniciarTransaccion();
        Aeronave a = new Aeronave(fabricante.toUpperCase(), modelo.toUpperCase(), tipoAeronave, vueloes);
        tipoAeronave.addAeronafe(a);
        this.persistencia.insertar(a);
        this.persistencia.confirmarTransaccion();
    }

    public void editarAeronave(Aeronave a, String fabricante, String modelo, TipoAeronave tipoAeronave, List<Vuelo> vueloes) {
        this.persistencia.iniciarTransaccion();
        a.setFabricante(fabricante.toUpperCase());
        a.setModelo(modelo.toUpperCase());
        a.setTipoAeronave(tipoAeronave);
        a.setVueloes(vueloes);
        this.persistencia.modificar(a);
        this.persistencia.confirmarTransaccion();
    }

    public int eliminarAeronave(Aeronave a) {
        if (a.getVueloes().isEmpty()) {     //verifico que la aeronave no tenga vuelos pendientes
            this.persistencia.iniciarTransaccion();
            this.persistencia.eliminar(a);  //las relaciones se manejan con CASCADA
            this.persistencia.confirmarTransaccion();
            return 0;
        } else {
            return 1;
        }
    }

    public List listarPasajero() {
        return this.persistencia.buscarTodos(Pasajero.class);
    }

    public Pasajero buscarPasajero(Long id) {
        return this.persistencia.buscar(Pasajero.class, id);
    }

    public void agregarPasajero(boolean viajeroFrecuente, String comida, String nombre, String apellido, String telefono, String email, Date fnac) {
        this.persistencia.iniciarTransaccion();
        Pasajero p = new Pasajero(viajeroFrecuente, comida.toUpperCase(), nombre.toUpperCase(), apellido.toUpperCase(), telefono.toUpperCase(), email.toUpperCase(), fnac);
        this.persistencia.insertar(p);
        this.persistencia.confirmarTransaccion();
    }

    public void editarPasajero(Pasajero p, boolean viajeroFrecuente, String comida, String nombre, String apellido, String telefono, String email, Date fnac) {
        this.persistencia.iniciarTransaccion();
        p.setViajeroFrecuente(viajeroFrecuente);
        p.setComida(comida);
        p.setNombre(nombre);
        p.setApellido(apellido);
        p.setTelefono(telefono);
        p.setEmail(email);
        p.setFnac(fnac);
        this.persistencia.modificar(p);
        this.persistencia.confirmarTransaccion();
    }

    public int eliminarPasajero(Pasajero p) {
        if (p.getReservas().isEmpty()) {     //verifico que el pasajero no tenga reservas
            this.persistencia.iniciarTransaccion();
            this.persistencia.eliminar(p);  //las relaciones se manejan con CASCADA
            this.persistencia.confirmarTransaccion();
            return 0;
        } else {
            return 1;
        }
    }

    public List listarReserva() {
        return this.persistencia.buscarTodos(Reserva.class);
    }

    public Reserva buscarReserva(Long id) {
        return this.persistencia.buscar(Reserva.class, id);
    }

    public void agregarReserva(String fila, String columna, int precio, Vuelo vuelo, Pasajero pasajero) {
        this.persistencia.iniciarTransaccion();
        Reserva r = new Reserva(fila.toUpperCase(), columna.toUpperCase(), precio, vuelo, pasajero);
        vuelo.getReservas().add(r);
        pasajero.getReservas().add(r);
        this.persistencia.insertar(r);
        //this.persistencia.modificar(vuelo);
        //this.persistencia.modificar(pasajero);
        this.persistencia.confirmarTransaccion();
    }

    public void editarReserva(Reserva r, String fila, String columna, int precio, Vuelo vuelo, Pasajero pasajero) {
        this.persistencia.iniciarTransaccion();
        r.setFila(fila);
        r.setColumna(columna);
        r.setPrecio(precio);
        r.setVuelo(vuelo);
        r.setPasajero(pasajero);
        this.persistencia.modificar(r);
        //this.persistencia.modificar(vuelo);
        //this.persistencia.modificar(pasajero);
        this.persistencia.confirmarTransaccion();
    }

    public void eliminarReserva(Reserva r) {
        this.persistencia.iniciarTransaccion();
        this.persistencia.eliminar(r);  //las relaciones se manejan con CASCADA
        this.persistencia.confirmarTransaccion();

    }

    public boolean disponible(Long idVuelo, String fila, String columna) {
        boolean disponible = this.persistencia.disponible(fila, columna, idVuelo);
        return disponible = true;
    }
}
