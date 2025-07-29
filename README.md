
# Android Skills Portfolio

## Equipo de Desarrollo
**Equipo #5**  
👥 Integrantes:
- Ana García - Desarrolladora Frontend  
- Carlos Méndez - Arquitecto de Software  
- Sofía Ramírez - Diseñadora UX/UI  

## Descripción del Proyecto
📱 **Tipo de Sistema**: Proyecto Móvil en Java (Android Studio)  
🔧 **Librería Externa**: Glide (para carga de imágenes)  

Aplicación educativa que demuestra 10 habilidades esenciales de desarrollo Android mediante ejercicios prácticos, incluyendo:
- Autenticación segura  
- Navegación entre actividades  
- Manejo de layouts avanzados  

---

## 🏆 Ejercicios Incluidos

### Ejercicio 1: Login Seguro  
![Captura Login](screenshots/login.png)  
Implementación de autenticación con validación de campos (correo: `tap2025@example.com`, contraseña: `tap*2025`).

### Ejercicio 2: RecyclerView con Glide  
![Captura Lista](screenshots/recycler.png)  
Lista interactiva de elementos con imágenes cargadas desde URL usando Glide.

*(Continúa hasta Ejercicio 10 con formato similar)*

---

## ⚙️ Requisitos Técnicos

### Versión Mínima
- **SDK Mínimo**: API 24 (Android 7.0 Nougat)  
- **Gradle**: 7.4+  

### Dependencias (`build.gradle`):
```gradle
dependencies {
    implementation 'com.github.bumptech.glide:glide:4.14.2'
    implementation 'androidx.appcompat:appcompat:1.6.1'
    implementation 'com.google.android.material:material:1.9.0'
}
```

### Buenas Prácticas Implementadas
✔️ Nomenclatura descriptiva (`btnLogin` vs `button1`)  
✔️ Comentarios breves en métodos complejos  
✔️ Separación de recursos (strings.xml, colors.xml)  

---

## 🚀 Instalación

1. **Clonar repositorio**:
   ```bash
   git clone https://github.com/tu-usuario/android-skills-portfolio.git
   ```

2. **Abrir en Android Studio**:
   - File > Open > Seleccionar carpeta del proyecto

3. **Sincronizar dependencias**:
   - Click en "Sync Now" al aparecer el aviso de Gradle

4. **Ejecutar en emulador/dispositivo**:
   - Seleccionar dispositivo virtual  
   - Click en ▶️ "Run 'app'"  

5. **(Opcional) Librerías manuales**:
   - Si usa .jar locales, copiarlas a `app/libs/` y agregar en `build.gradle`:
   ```gradle
   implementation files('libs/tu_libreria.jar')
   ```

---

📌 **Nota**: Requiere Android Studio Flamingo (2022.2.1) o superior para óptimo funcionamiento.
``` 
