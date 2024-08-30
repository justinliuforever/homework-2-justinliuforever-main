## Task 3: UML Class Relationships

1. **Faculty and Department: Aggregation Relationship**

   - **Relationship Name:** Aggregation
   - **Description:** The diagram shows an aggregation relationship between `Faculty` and `Department`. This means that a `Department` can exist independently of the `Faculty`.  At the `Faculty` end, the multiplicity is `*`, meaning that a `Faculty` can have multiple departments. The navigability arrow pointing from `Department` to `Faculty` suggests that `Department` can access or reference its associated `Faculty`, but not necessarily vice versa.

2. **AlarmController and Sensor: Association Relationship with Multiplicity**

   - **Relationship Name:** Association
   - **Description:** The diagram shows an association relationship between `AlarmController` and `Sensor` with specified multiplicity. The multiplicity `1` on the `AlarmController` side means that each `Sensor` is associated with exactly one `AlarmController`. The multiplicity `1..*` on the `Sensor` side indicates that an `AlarmController` is associated with one or more `Sensors`. This means an `AlarmController` controls multiple sensors, and each sensor is controlled by exactly one `AlarmController`.