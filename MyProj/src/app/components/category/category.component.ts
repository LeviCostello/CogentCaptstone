import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-category',
  templateUrl: './category.component.html',
  styleUrls: ['./category.component.css'],
})
export class CategoryComponent implements OnInit {
  categoryList: string[] = [
    'MountaineeringEquipment',
    'CampingEquipment',
    'GolfEquipment',
    'OutdoorProtection',
    'PersonalAccessories',
  ];

  constructor() {}

  ngOnInit(): void {}
}
