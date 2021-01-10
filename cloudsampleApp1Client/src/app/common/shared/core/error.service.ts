

import { Injectable } from '@angular/core';
import { MatSnackBar } from '@angular/material/snack-bar';

@Injectable({
    providedIn: 'root'
  })
export class ErrorService {
    constructor(private snackBar: MatSnackBar) {
    }

    showError(message: string) {
        this.snackBar.open(message, null, {
            duration: 2000,
        });
    }

}
