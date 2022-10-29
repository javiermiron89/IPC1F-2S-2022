import { Router } from "express";

const todosUsuarios = [
    {
        Usuario: "IPCF",
        Password: "123"
    }
];

class UsuariosRoutes {

    public router: Router = Router();

    constructor() {
        this.config();
    }

    config(): void {

        this.router.get('/todos', (req, res) => {
            res.send(todosUsuarios);
        });
    }

}

const usuariosRouter = new UsuariosRoutes();
export default usuariosRouter.router;