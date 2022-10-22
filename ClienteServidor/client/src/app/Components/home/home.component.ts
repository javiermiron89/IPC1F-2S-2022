import { Component, OnInit } from '@angular/core';

import { JugadorService } from 'src/app/Services/jugador.service';

import { JugadorInterface } from 'src/app/Models/jugadorInterface';

@Component({
  selector: 'app-home',
  templateUrl: './home.component.html',
  styleUrls: ['./home.component.css']
})
export class HomeComponent implements OnInit {

  //Arreglo para los jugadores
  datosJugadores: JugadorInterface[] = [];

  constructor(public jugadorService: JugadorService) { }

  ngOnInit(): void {
    this.ObtenerJugadores();
  }

  ObtenerJugadores(){
    this.jugadorService.CargarDatos().subscribe(async (res) =>
    {
      let datos: any = res;
      this.datosJugadores = datos;
      //console.log("LISTADO DE JUGADORES: ");
      //console.log(this.datosJugadores);
    },
    err => console.log(err));
  }

}
