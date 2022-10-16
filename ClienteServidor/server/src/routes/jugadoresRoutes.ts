import { Router } from "express";

const todosJugadores = [
    {
        id: 1,
        nombre: "Lionel",
        apellido: "Messi",
        seleccion: "Argentina",
        Region: "CONMEBOL",
        Imagen: "https://cdn.sofifa.net/players/158/023/23_120.png"
    },
    {
        id: 1,
        nombre: "Ángel",
        apellido: "Hernández",
        seleccion: "Argentina",
        Region: "CONMEBOL",
        Imagen: "https://cdn.sofifa.net/players/183/898/23_120.png"
    },
    {
        id: 2,
        nombre: "Cristiano",
        apellido: "Ronaldo",
        seleccion: "Portugal",
        Region: "UEFA",
        Imagen: "https://cdn.sofifa.net/players/020/801/22_120.png"
    },
    {
        id: 3,
        nombre: "Antonio",
        apellido: "Rüdiger",
        seleccion: "Germany",
        Region: "UEFA",
        Imagen: "https://cdn.sofifa.net/players/020/801/22_120.png"
    }
];

class JugadoresRoutes {

    public router: Router = Router();

    constructor() {
        this.config();
    }

    config(): void {
        this.router.get('/hola', (req, res) => res.send("Hola Mundo"));

        this.router.get('/todos', (req, res) => {
            res.send(todosJugadores);
        });

        this.router.get('/nombre/:nombre', (req, res) => {
            //console.log(req.params.nombre);
            const jugador = this.obtenerJugadorPorNombre(req.params.nombre);
            res.send(jugador);
        });

        this.router.get('/seleccion/:nombre', (req, res) => {
            //console.log(req.params.nombre);
            const jugador = this.obtenerSeleccionPorNombre(req.params.nombre);
            res.send(jugador);
        });
    }

    obtenerJugadorPorNombre(nombreJugador: any): any {
        return todosJugadores.find(dato => dato.nombre == nombreJugador);
    }

    obtenerSeleccionPorNombre(nombreSeleccion: any): any {
        let tempo = [];
        for (const jugador of todosJugadores) {
            if (jugador.seleccion == nombreSeleccion) {
                tempo.push(jugador);
            }
        }
        return tempo;
    }

}

const jugadoresRouter = new JugadoresRoutes();
export default jugadoresRouter.router;