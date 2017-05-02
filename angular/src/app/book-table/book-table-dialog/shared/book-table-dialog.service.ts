import { Injectable } from '@angular/core';
import { Http, Headers } from '@angular/http';
import { Observable } from 'rxjs/Observable';
import { BusinessOperations } from '../../../shared/BusinessOperations';

@Injectable()
export class BookTableDialogService {

  BO: BusinessOperations = new BusinessOperations();

  constructor(private http: Http) {
  }

  // Remark: Code duplication. Please have a look at invitations-dialog-service, also a separate service for reservations/invitations would solve it.
  getTableId(): Observable<any> {
    return this.http.get(this.BO.getbookingid)
                    .map((res: any) => res.json());
  }

  postBookingTable(bookInfo): Observable<any> {
    return this.http.post(this.BO.postbookingtable, bookInfo)
                    .map((res: any) => res.json());
  }

}
