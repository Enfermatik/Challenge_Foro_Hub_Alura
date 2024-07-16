<h1>Desaf&iacute;o Foro Hub</h1>
<h2>Descripci&oacute;n general</h2>
<p>Challenge.Foro.Hub es una aplicaci&oacute;n web basada en Spring Boot que proporciona una plataforma de foro para que los usuarios creen y administren temas, cursos y cuentas de usuario. La aplicaci&oacute;n utiliza tokens JWT para autenticaci&oacute;n y autorizaci&oacute;n.</p>
<h2>Repositorio</h2>
<p>Este proyecto est&aacute; alojado en GitHub: <a href="https://github.com/Enfermatik/Challenge_Foro_Hub_Alura">https://github.com/Enfermatik/Challenge_Foro_Hub_Alura</a></p>
<h2>M&oacute;dulos</h2>
<ul>
<li><strong>Controlador</strong>: maneja las solicitudes HTTP entrantes y env&iacute;a respuestas.</li>
<li><strong>Dominio</strong>: define la l&oacute;gica empresarial y los modelos de datos para la aplicaci&oacute;n.</li>
<li><strong>Repositorio</strong>: proporciona objetos de acceso a datos (DAO) para interactuar con la base de datos.</li>
<li><strong>Seguridad</strong>: maneja la autenticaci&oacute;n y autorizaci&oacute;n mediante tokens JWT.</li>
<li><strong>Servicio</strong>: Proporciona funcionalidad adicional para la aplicaci&oacute;n.</li>
</ul>
<h2>Caracter&iacute;sticas clave</h2>
<ul>
<li>Autenticaci&oacute;n y autorizaci&oacute;n de usuario mediante tokens JWT</li>
<li>Creaci&oacute;n, listado y gesti&oacute;n de temas.</li>
<li>Creaci&oacute;n y gesti&oacute;n de cursos.</li>
<li>Creaci&oacute;n y gesti&oacute;n de cuentas de usuario.</li>
<li>Manejo de errores y validaci&oacute;n.</li>
</ul>
<h2>Tecnolog&iacute;a utilizada</h2>
<ul>
<li>Spring Boot 2.x</li>
<li>Java 11</li>
<li>Hibernate 5.x</li>
<li>JWT 0.9.x</li>
<li>Lombok 1.18.x</li>
<li>BCrypt 1.1.x</li>
</ul>
<h2>Puntos finales API</h2>
<h3>Autenticaci&oacute;n</h3>
<ul>
<li><code>POST /login</code>: autenticar a un usuario y generar un token JWT</li>
<li><code>GET /login</code>: validar un token JWT</li>
</ul>
<h3>Temas</h3>
<ul>
<li><code>POST /topicos</code>: Crear un nuevo tema</li>
<li><code>GET /topicos</code>: enumera todos los temas</li>
<li><code>GET /topicos/{id}</code>: recuperar un tema por ID</li>
<li><code>PUT /topicos/{id}</code>: Actualizar un tema</li>
<li><code>DELETE /topicos/{id}</code>: Eliminar un tema</li>
</ul>
<h3>Cursos</h3>
<ul>
<li><code>GET /cursos</code>: Listar todos los cursos</li>
</ul>
<h3>Usuarios</h3>
<ul>
<li><code>POST /usuarios</code>: Crear un nuevo usuario</li>
<li><code>GET /usuarios</code>: Listar todos los usuarios</li>
<li><code>GET /usuarios/{id}</code>: Recuperar un usuario por ID</li>
<li><code>PUT /usuarios/{id}</code>: Actualizar un usuario</li>
<li><code>DELETE /usuarios/{id}</code>: Eliminar un usuario</li>
</ul>
<h2>Manejo de errores</h2>
<p>La aplicaci&oacute;n utiliza un controlador de errores personalizado para detectar y manejar excepciones. Los errores se devuelven en el siguiente formato:</p>
<pre><code> { "error": "Mensaje de error", "estado": 400 } </code></pre>
<h2>&nbsp;</h2>
<div style="color: hsl(var(--border));">&nbsp;</div>
<div style="color: hsl(var(--border));">
<div style="color: hsl(var(--border));">&nbsp;</div>
</div>
<div style="color: hsl(var(--border));">
<div style="color: rgb(71 85 105/var(--tw-border-opacity));">
<div style="color: hsl(var(--border));">
<div style="color: hsl(var(--border)); font-size: 0.875rem;">&nbsp;</div>
</div>
</div>
</div>
<div style="color: hsl(var(--border));">&nbsp;</div>
<div style="color: hsl(var(--border));">
<div style="color: hsl(var(--border));">&nbsp;</div>
</div>
<div style="text-align: start; color: hsl(var(--border)); background-color: rgba(244, 244, 245, 0.5); font-size: medium;">&nbsp;</div>
