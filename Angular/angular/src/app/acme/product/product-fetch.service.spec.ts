import { TestBed } from '@angular/core/testing';

import { ProductFetchService } from './product-fetch.service';

describe('ProductFetchService', () => {
  beforeEach(() => TestBed.configureTestingModule({}));

  it('should be created', () => {
    const service: ProductFetchService = TestBed.get(ProductFetchService);
    expect(service).toBeTruthy();
  });
});
