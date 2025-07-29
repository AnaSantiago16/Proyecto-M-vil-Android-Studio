
# Android Skills Portfolio

 Equipo de Desarrollo
**Equipo 15**  
👥 Integrantes:
 Ana Belen Santiago Pérez - Desarrolladora y Diseñadora UX/UI  

 Descripción del Proyecto
📱 **Tipo de Sistema**: Proyecto Móvil en Java (Android Studio)  
🔧 **Librería Externa**: Glide (para carga de imágenes)  

Aplicación  que demuestra 10 habilidades esenciales de desarrollo Android mediante ejercicios prácticos, incluyendo:
- Autenticación segura  
- Navegación entre actividades  
- Manejo de layouts avanzados  
Comenzamos con la implementación de autenticación con validación de credenciales estáticas (correo: tap2025@example.com, contraseña: tap*2025). Uso de EditText con validación en tiempo real.

Aquí tienes el contenido con mejor formato, más limpio y organizado para presentación o documentación, manteniendo emojis, imágenes y bloques de código correctamente estructurados:

---

# 🏆 **Ejercicios Incluidos**

---

## ✅ Ejercicio 1: Visibilidad de Componentes

<img width="148" height="367" alt="Ejercicio 1" src="https://github.com/user-attachments/assets/20230913-0b16-4441-b939-5a0c9c1aba1a" />

**Funcionalidad:**

* 2 `TextView` (nombre y ciudad)
* 4 botones para controlar visibilidad
* Uso de `setVisibility(View.VISIBLE/INVISIBLE)`

**Código clave:**

```java
btnOcultarNombre.setOnClickListener(v -> lblNombre.setVisibility(View.INVISIBLE));
btnVisuNombre.setOnClickListener(v -> lblNombre.setVisibility(View.VISIBLE));
```

---

## ✅ Ejercicio 2: Transferencia de Texto

<img width="159" height="333" alt="Ejercicio 2" src="https://github.com/user-attachments/assets/9910ce6f-2c38-402d-810b-b6731927bc39" />

**Funcionalidad:**

* 1 `EditText` para entrada
* 2 `TextView` para salida
* 2 botones para copiar texto
* Uso de `getText()` y `setText()`

**Código clave:**

```java
btnTraspasa1.setOnClickListener(v -> lblTexto1.setText(txtTexto.getText()));
```

---

## ✅ Ejercicio 3: Transferencia de Texto en Tiempo Real

<img width="170" height="362" alt="Ejercicio 3" src="https://github.com/user-attachments/assets/61518d79-8366-422c-b146-9902fdfcd9da" />

**Componentes:**

* `EditText` (`txtTexto`)
* `TextView` (`lblTexto`)
* `Button` (`btnVaciar`)

**Lógica en tiempo real:**

```java
txtTexto.addTextChangedListener(new TextWatcher() {
    public void afterTextChanged(Editable s) {
        lblTexto.setText(s.toString());
    }
});
```

---

## ✅ Ejercicio 4: Formulario con Validación

<img width="129" height="361" alt="Ejercicio 4" src="https://github.com/user-attachments/assets/b5e10d21-161a-472f-8019-5694d692688f" />

**Funcionalidades:**

* Concatenación de texto:

```java
"Usted se llama " + nombre + " y vive en " + ciudad;
```

* Activación/desactivación de campos:

```java
editText.setEnabled(false);
```

---

## ✅ Ejercicio 5: Calculadora de Ventas

<img width="130" height="313" alt="Ejercicio 5" src="https://github.com/user-attachments/assets/7846fb17-5ddc-426c-acde-6b0c84ef808a" />

**Cálculos de total + IVA:**

```java
double total = unidades * precio;
double iva = total * 0.16;
lblTotalMasIva.setText(String.format("$%.2f", total + iva));
```

---

## ✅ Ejercicio 6: Evento Click Básico

<img width="173" height="286" alt="Ejercicio 6" src="https://github.com/user-attachments/assets/06374b45-1beb-49c9-8348-227aa5dabd06" />

**Funcionalidad:**

* Cambiar el texto de un `TextView` usando `OnClickListener`

---

## ✅ Ejercicio 7: Cambio de Color de Fondo

<img width="110" height="263" alt="Ejercicio 7" src="https://github.com/user-attachments/assets/d25eb3d4-2a4d-4763-bee5-b95234ae5b3d" />

**Funcionalidad:**

* Uso de `setBackgroundColor(Color.RED)`
* Opcional: uso de selector de color

---

## ✅ Ejercicio 8: Selección Múltiple (CheckBox)

<img width="173" height="346" alt="Ejercicio 8" src="https://github.com/user-attachments/assets/4c1a17ea-0155-4da5-a320-3289fde9e642" />

**Lógica para concatenar selecciones:**

```java
StringBuilder seleccion = new StringBuilder();
if (cbFutbol.isChecked()) seleccion.append("Fútbol ");
if (cbBeisbol.isChecked()) seleccion.append("Béisbol ");
```

---

## ✅ Ejercicio 9: Selección Única (RadioGroup)

<img width="213" height="354" alt="Ejercicio 9" src="https://github.com/user-attachments/assets/0bf4a0dd-e30d-43fc-80d3-c1d08c32138f" />

**Configuración XML:**

```xml
<RadioGroup>
    <RadioButton android:text="Opción 1"/>
    <RadioButton android:text="Opción 2" android:checked="true"/>
</RadioGroup>
```

---

## ✅ Ejercicio 10: Lista Seleccionable

<img width="171" height="278" alt="Ejercicio 10" src="https://github.com/user-attachments/assets/60b12ebf-c7f9-4fa0-961a-83722ba2f012" />

**Adaptador personalizado para `ListView`:**

```java
ArrayAdapter<String> adapter = new ArrayAdapter<>(this,
    android.R.layout.simple_list_item_1, ciudades);
```

---

⚙️ Configuración Técnica
Requisitos Mínimos
Android Studio: Electric Eel 2022.1.1+

SDK Mínimo: API 26 (Android 8.0)


Aquí tienes el apartado **🚀 Instalación** con mejor formato y claridad para que sea fácil de seguir:

---

## 🚀 Instalación

### ✅ Requisitos Previos:

* Tener **Android Studio** instalado.
* JDK 8 o superior configurado.
* Emulador o dispositivo físico con Android 5.0 o superior.

### 🧭 Pasos para instalar y ejecutar:

1. **Clonar el repositorio:**

   ```bash
   git clone https://github.com/tu_usuario/tu_proyecto.git
   ```

2. **Abrir el proyecto en Android Studio:**

   * Abrir Android Studio.
   * Seleccionar **"Open an existing project"**.
   * Navegar a la carpeta del proyecto clonado.

3. **Esperar a que gradle sincronice:**

   * Android Studio descargará las dependencias automáticamente.
   * Si hay errores, revisar el archivo `build.gradle` (nivel app y proyecto).

4. **Agregar librerías .jar si aplica:**

   * Si el proyecto utiliza librerías externas, agrégalas en:

     ```
     app/libs/
     ```

     Y luego en `build.gradle (Module: app)`:

     ```gradle
     implementation files('libs/nombre_libreria.jar')
     ```

5. **Ejecutar la aplicación:**

   * Conectar un dispositivo o abrir un emulador.
   * Presionar **Run (Shift + F10)** o usar el botón ▶️ en Android Studio.

6. **(Opcional) Configurar permisos o ajustes en el Manifest:**

   * Revisa si hay permisos que deben otorgarse manualmente desde:

     ```xml
     AndroidManifest.xml
     ```

---



📌 Nota: Todos los ejercicios usan componentes estándar de Android sin dependencias externas.

### Recomendaciones adicionales:
1. Para ejercicios con cálculos (Ej5), considera usar `BigDecimal` para precisión monetaria
2. En selección múltiple (Ej8), implementa `CompoundButton.OnCheckedChangeListener`
3. Para el Ej10, usa `setOnItemClickListener` en el ListView

