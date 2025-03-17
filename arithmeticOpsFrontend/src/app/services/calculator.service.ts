import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { resultResponse } from '../data/resultResponse';
import { operationRequest } from '../data/operationRequest';

@Injectable({
  providedIn: 'root'
})
export class CalculatorService {

  private apiUrl = 'http://localhost:8080/webapp/calculator';

  constructor(private http: HttpClient) { }

  calculate(newOperation: operationRequest): Observable<resultResponse> {
    return this.http.get<resultResponse>(
      `${this.apiUrl}?value1=${newOperation.value1}&value2=${newOperation.value2}&operationType=${newOperation.operationType}`
    );
  }
}
