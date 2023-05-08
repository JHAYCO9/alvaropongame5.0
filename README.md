Descripción de la aplicación

La aplicación es una lista de tareas pendientes que permite al usuario crear, leer, actualizar y eliminar tareas. Cada tarea tiene un título, una descripción y un estado de completado (ya sea "completado" o "pendiente"). La aplicación utiliza una interfaz de consola simple para mostrar la lista de tareas y recibir la entrada del usuario.

Arquitectura MVC
La aplicación sigue la arquitectura Modelo-Vista-Controlador (MVC). En esta arquitectura, el modelo representa los datos y la lógica de la aplicación, la vista representa la interfaz de usuario y el controlador actúa como intermediario entre el modelo y la vista, gestionando las interacciones del usuario y actualizando el modelo y la vista en consecuencia.

Componentes de la aplicación

El modelo es la clase Tarea, que representa una tarea en la lista de tareas pendientes. Contiene propiedades para el título, la descripción y el estado de la tarea.

La vista es la clase ConsoleView, que es responsable de mostrar la lista de tareas y recibir la entrada del usuario a través de la interfaz de consola.

El controlador es la clase TaskController, que administra la interacción entre el modelo y la vista. Contiene métodos para las operaciones CRUD (crear, leer, actualizar y eliminar) y maneja las excepciones de entrada inválida.

Funcionalidades de la aplicación
La aplicación tiene las siguientes funcionalidades:

Mostrar la lista de tareas pendientes
Crear una nueva tarea
Leer una tarea existente
Actualizar una tarea existente
Eliminar una tarea existente
