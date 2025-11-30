# Orekit Orbit Simulation – Overview of Codes
Scroll to the bottom for Prerequisites.

## firstprogram.java
- Initializes **Orekit** by loading the `orekit-data` directory.
- Uses the **new DataContext API** (Orekit 11+).
- Creates an `AbsoluteDate` to confirm time system is working.
- Prints confirmation that Orekit data loaded successfully.
- Provides a basic template for all future Orekit-based simulations.

## SimpleSimulation.java
- Create a **Maven Java project** in Eclipse using **Orekit**.
- Add **orekit-data** and properly load it at runtime.
- Implement a **simple orbit propagator** that outputs position & velocity over time.
- Add a **minimal HTTP endpoint** that serves the satellite’s current state as JSON (for Open MCT polling).
- Include troubleshooting notes for **Hipparchus**, classpath issues, and orekit-data configuration.

## Prerequisites

### Java
- **JDK 11 or 17** installed  
- `JAVA_HOME` correctly set  

### IDE
- **Eclipse** with Maven (M2E)  
- **VS Code** with Java/Maven extensions
  or
- Something similar 

### Orekit Data
- Download the official **orekit-data** bundle  
  (contains frames, Earth models, time scales, etc).  
- Unzip it somewhere accessible, for example:
  - `C:\orekit-data` (Windows)
  - `~/orekit-data` (macOS/Linux)

You will point Orekit to this directory during initialization.
***
