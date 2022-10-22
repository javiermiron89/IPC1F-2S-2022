import { Component, Input, OnInit } from '@angular/core';

import { JugadorInterface } from 'src/app/Models/jugadorInterface';

@Component({
  selector: 'app-tarjetas',
  templateUrl: './tarjetas.component.html',
  styleUrls: ['./tarjetas.component.css']
})
export class TarjetasComponent implements OnInit {

  //Variable que recibe el dato desde un componente padre
  //En este caso, va a obtener la informacion de un jugador.
  @Input() datoJugadorEspecifico: JugadorInterface;

  constructor() { }

  ngOnInit(): void {
    console.log("---------------------");
    console.log(this.datoJugadorEspecifico);
    console.log("---------------------");
  }

}
