import { TestBed } from '@angular/core/testing';
import { NtServiceService } from './nt-service.service';

describe('NtServiceService', () => {
  let service: NtServiceService;

  beforeEach(() => {
    TestBed.configureTestingModule({});
    service = TestBed.inject(NtServiceService);
  });

  it('should be created', () => {
    expect(service).toBeTruthy();
  });
});
