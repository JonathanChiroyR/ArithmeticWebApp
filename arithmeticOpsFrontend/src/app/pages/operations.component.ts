import { HttpClient } from '@angular/common/http';
import { Component } from '@angular/core';
import { operationRequest } from '../data/operationRequest';
import { resultResponse } from '../data/resultResponse';
import { CalculatorService } from '../services/calculator.service';
import { NgModule } from '@angular/core';
import { FormsModule } from '@angular/forms';
import { CommonModule } from '@angular/common';


@Component({
  selector: 'app-operations',
  imports: [FormsModule, CommonModule],
  templateUrl: './operations.component.html',
  styleUrl: './operations.component.css'
})
export class OperationsComponent {

  newOperation: operationRequest = {
    value1: 0,
    value2: 0,
    operationType: 'add'
  };

  newResponse: resultResponse | null = null;

  constructor(private calcultatorService: CalculatorService){}

  calculate() {
    // Validar si los valores son enteros
    if (!Number.isInteger(this.newOperation.value1) || !Number.isInteger(this.newOperation.value2)) {
        this.newOperation.value1 = 0;
        this.newOperation.value2 = 0;
        this.newResponse = { result: 0, message: 'Only integers are allowed.' };
        return; // Detener la ejecución de la función
    }

    // Si los valores son enteros, continuar con la llamada a la API
    this.calcultatorService.calculate(this.newOperation).subscribe(
      (apiResponse: resultResponse) => {
        this.newResponse = apiResponse;
      },
      error => {
        this.newResponse = { result: 0, message: 'Error to communicate with API.' };
      }
    );
}


}
