# hx-sp_backend
Demo for HX
Utilizando Spring Boot + Hibernate.

Inyección de dependencias -> Con la decoración @Autowired estoy inyectando una dependencia evitando tener que instanciar cada que se quiera crear un objeto. Esto gracias a los repositorios y beans creados (@Repository, @Service), dándole el adeecuado conexto a todas las capas.

"El backend deberá exponer un servicio rest que liste todas las personas de la base de datos". Realicé el modelado de la entidad "Persona", generando API Rest para listar
las personas existentes en la BD (Creada en PostgreSQL), otra para el Create y otra para la función pedida de verificar si una persona nació o no en año bisiesto.
También desarrollé el test unitario pedido para la parte de la función que determina si el año de nacimiento de una persona es bisisesto o no. 

Uno de los patrones de diseñó implementados fue el Repository para aislar la capa de data. (Pudo haber sido DAO que también tiene un fucnionamiento similar). 
