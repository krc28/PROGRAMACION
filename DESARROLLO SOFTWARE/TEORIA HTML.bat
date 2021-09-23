"Comienzo
 <identificador atributo1 atributo2 ...>
"Final
</identificador>
Algunos elementos no necesitan etiquetas de cierre.

"Etiquetas anidadas
<p align=”center”>
 <font color=”#993366” size=”4” face=”Comic Sans MS,
Arial, MS Sans Serif”>
 Bienvenidos a www.aulaclic.com
 </font>
</p>


"Estructura general
<html>
<head>
 ...
</head>
 <body>
 ...
</body>
</html>


"Etiqueta <html> </html>
• Identifica el tipo de documento.
• Todas las páginas web escritas en HTML tienen que tener la
extensión html o htm. Al mismo tiempo, tienen que tener
las etiquetas <html> y </html>.
• Entre las etiquetas <html> y </html> estará comprendido el
resto del código HTML de la página.


"Cabecera <head> </head>
• Se utiliza para agrupar información sobre la página, como
puede ser el título.
• Está formada por las etiquetas <head> y </head>. La
etiqueta <head> va justo debajo de la etiqueta <html>.
• Entre las etiquetas <head> </head> podemos encontrar
etiquetas como:
• <link> <style> <script>
• <meta>
• <title>

"Etiqueta <title> </title>
<html>
<head>
 <title>
Introduction HTML
 </title>
</head>
</html>


"Etiqueta <link>
• La etiqueta <link> define un enlace entre el documento y
algún recurso externo.
• El elemento link debe ser ubicado en la sección head del
documento.
• rel: escribe la relación entre el documento y el destino del
enlace.
• type: especifica el tipo de documento a enlazar. El más
común es type=”text/css”.
• href: especifica la localización del documento enlazado.

"Etiqueta <style>
• La etiqueta <style> define hojas de estilo para el
documento actual.
• Esta etiqueta debe ser ubicada en la cabecera del
documento.


"Etiqueta <meta>
• Se utiliza para añadir información sobre la página. Esta
información puede ser utilizada por los buscadores.
• Los buscadores consultan la información de la
etiqueta <meta>.
• Se pueden especificar los atributos name (tipo de
información) y content (valor de dicha información).
• Los tipos de información más utilizados son:
Tipo                         Significado
author                       Autor de la página
classification               Palabras para clasificar la página en los buscadores
description                  Descripción del contenido de la página
generator                    Programa utilizado para crear la página
keywords                     Palabras clave

• No necesita etiqueta de cierre.
• También se utiliza para indicarle al navegador alguna
información o alguna acción que debe realizar. En este caso
se utiliza el atributo http-equiv.

"Etiqueta <body> </body>
• El cuerpo del documento contiene la información propia
del documento, es decir, lo que queremos que se visualice,
el texto de la página, las imágenes, los formularios, etc.

"Etiqueta <p> </p>
• Introducir texto en la página.
• Varios espacios en blanco: &nbsp
• Salto de línea: <br>

"Enlaces <a> </a>
• Un hiperenlace, hipervínculo o vínculo no es más que un
enlace, que al ser pulsado lleva a una página o archivo.
• Aquellos elementos (texto, imágenes, etc.) sobre los que
se desee insertar un enlace han de encontrarse entre las
etiquetas <a> y </a>.
• A través del atributo href se especifica la página o el archivo
a la que está asociado el enlace.
• Referencia absoluta
• Referencia relativa al sitio:
• <a href=“/nombreDelArchivo.html”>Ir a … </a>
• Punto de fijación:
• <a href=“/nombreDocumento.html #nombrePunto“> Ir a
punto </a>
• _blank:
• Abre el documento vinculado en una ventana nueva del
navegador.
• _self:
• Es la opción predeterminada. Abre el documento
vinculado en el mismo marco o ventana que el vínculo
• link permite determinar el color de los enlaces sin visitar
(enlace que no ha sido pulsado ninguna vez).
• active permite determinar el color del enlace activo (enlace
que acaba de ser pulsado).
• visited permite determinar el color de los enlaces visitados
(enlaces que ya han sido pulsados).

"Tablas <table> </table>
• Las tablas están formadas por celdas, que son los
recuadros que se obtienen como resultado de la
intersección entre una fila y una columna
• Etiquetas
• <table></table>
• <tr></tr>
• <td></td>

"Atributos de una tabla
• align: alinea horizontalmente la tabla con respecto a su
entorno.
• background: permite poner un fondo para la tabla a partir
de un enlace a una imagen.
• bgcolor: da color de fondo a la tabla.
• border: define el número de pixeles del borde principal.
• bordercolor: define el color del borde.
• cellpadding: define, en pixeles, el espacio entre los bordes
de la celda y el contenido de la misma.
• cellspacing: define el espacio entre los bordes (en pixeles).
• height: define la altura de la tabla en pixeles o porcentaje.
• width: define la anchura de la tabla en pixeles o porcentaje

"Atributos de una celda
• bgcolor =”nombre del color / número hexadecimal”.
Define el color de la celda o fila.
• bordercolor=”nombre del color / número hexadecimal”.
Define el color del borde de la celda.
• align=”top / middle / bottom”. Elegimos el lugar en el cual
el texto es colocado. Top (arriba), middle (centro) y bottom
(abajo).
• valign=”left / center / right”. Alineación del texto
izquierda (left), centro (center) o derecha (right)
• colspan=”n”. Expande una celda horizontalmente tantas
celdas como el valor asignado a n.
• rowspan=”n”. Expande una celda verticalmente tantas
celdas como el valor asignado a n.
• width=”n”. El valor n indica la anchura de la tabla en
pixeles (200) o porcentaje (20%). Este atributo también se
puede aplicar a las celdas <td>.
• height =”n”. El valor n define la altura de la celda en pixeles
o porcentaje.