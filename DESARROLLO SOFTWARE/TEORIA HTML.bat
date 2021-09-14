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
• No necesita etiqueta de cierre.
• También se utiliza para indicarle al navegador alguna
información o alguna acción que debe realizar. En este caso
se utiliza el atributo http-equiv.