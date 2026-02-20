# 1. Qué es un repositorio en Git y en qué se diferencia de una carpeta común
Un repositorio es una carpeta de trabajo que, además de contener los archivos del proyecto, incluye un sistema interno que registra cada cambio realizado.
Ese historial permite revisar versiones anteriores, comparar modificaciones y colaborar con otras personas.
En cambio, un proyecto “normal” solo guarda los archivos, sin registro de versiones.
La información de control de Git se almacena en una carpeta llamada .git, donde se encuentra todo el historial.

# 2. Las tres áreas principales de Git y su función
Git organiza el trabajo en tres zonas:

- Working directory: lo que ves físicamente en tu computadora; tus archivos editados.
- Staging area (index): una zona de preparación donde decides qué cambios incluir en el próximo commit.
- Repository (local): donde quedan almacenados los commits ya registrados.


# 3. Cómo almacena Git la información internamente: blob, tree, commit y tag
Git maneja objetos internos para representar el estado del proyecto:

- Blob: guarda únicamente el contenido de un archivo, sin su nombre.
- Tree: define la estructura de carpetas y los nombres de archivos, indicando a qué blobs apuntan.
- Commit: captura el proyecto en un momento dado, enlaza al tree correspondiente y a los commits padres.
- Tag: un nombre que señala un commit específico, útil para marcar versiones estables o lanzamientos.


# 4. Cómo crear un commit y qué información contiene
Proceso típico:

1. Revisar el estado: git status
2. Seleccionar cambios: git add archivo o git add .
3. Registrar: git commit -m "mensaje"

Un commit contiene:

- un tree que representa el estado del proyecto,
- referencia al commit anterior,
- autor y fecha del cambio,
- mensaje descriptivo,
- un hash único que lo identifica.

# 5. Diferencia entre git fetch y git pull

- git fetch: descarga actualizaciones del repositorio remoto, pero no modifica tu rama actual. Te permite revisar antes de integrar.
- git pull: descarga e integra inmediatamente los cambios en tu rama. Es rápido, pero puede provocar conflictos si hay diferencias entre ambas versiones.


# 6. Qué es un branch y cómo se mueven los punteros
Un branch es simplemente un nombre que señala un commit concreto. No es una copia del proyecto.
Cada vez que haces un commit en esa rama, el puntero avanza al nuevo commit.
El puntero HEAD indica la rama o commit en el que estás trabajando en ese momento.

# 7. Cómo realizar un merge y qué tipos de conflictos pueden ocurrir
Para unir dos ramas, primero te posicionas en la rama que recibirá los cambios y luego mezclas:

  *git switch main*
  *git merge feature*

Conflictos comunes:

- Ambas ramas modificaron la misma línea de un archivo.
- Una rama borró un archivo mientras la otra lo editó.

**Solución:**

1. Abrir el archivo marcado como conflicto.
2. Conservar una versión, o combinar ambas manualmente.
3. Guardar.
4. Marcarlo como resuelto: git add archivo
5. Completar el merge con git commit si Git lo requiere.


# 8. Cómo funciona el staging con git add y qué ocurre si lo omito
- git add coloca cambios en el área de preparación.
- git commit solo registra lo que está en esa área.
- Si saltas el git add, el commit no incluirá tus modificaciones, y Git indicará que no hay nada para guardar.
- Los cambios no se pierden: permanecen en tu carpeta local.

# 9. Qué es el archivo .gitignore y cómo influencia el seguimiento
*.gitignore*, especifica qué archivos o carpetas Git debe ignorar.
Sirve para excluir archivos que no deben subirse, como temporales, configuraciones locales o dependencias pesadas.
Si un archivo ya estaba siendo rastreado, incluirlo en .gitignore no lo saca automáticamente; para dejar de rastrearlo:

  *git rm --cached archivo*

Ejemplos comunes para ignorar:

*node_modules/*
*.log*
*.env*


# 10. Diferencia entre git commit --amend y crear un commit nuevo

git commit --amend reemplaza el commit más reciente para corregir un mensaje o añadir cambios que olvidaste.
En realidad genera un commit nuevo que ocupa el lugar del anterior.
Un commit nuevo simplemente agrega otro registro en la historia.

>[!NOTE]
>Usa amend solo si el commit aún no fue compartido; si ya fue enviado al remoto, es mejor crear un commit adicional.

# 11. Para qué sirve git stash y cómo usarlo
git stash permite guardar temporalmente tus modificaciones sin hacer commit, dejando tu directorio limpio para cambiar de tarea o de rama.
Comandos útiles:

Guardar: git stash
- Ver lista: git stash list
- Recuperar y quitar de la lista: git stash pop
- Recuperar sin quitar: git stash apply
- Eliminar un stash: git stash drop


# 12. Formas de deshacer cambios: reset, revert, restore, checkout
Para descartar modificaciones en un archivo:

  git restore archivo

Para quitar un archivo del staging:

  git restore --staged archivo

git reset reposiciona la rama en un commit anterior:

--soft: mueve la rama, conserva staging y archivos.
--mixed: mueve la rama, limpia staging, conserva archivos.
--hard: mueve la rama y borra todo lo no guardado, incluido staging y archivos.

git revert crea un commit que deshace otro sin modificar la historia existente, lo más seguro para cambios ya compartidos.
Git antes usaba checkout para todo, pero ahora se recomienda:

- git switch para cambiar de rama
- git restore para restaurar archivos


# 13. Remotos: origin, upstream y uso con forks
Un remoto es una copia del repositorio almacenada en un servidor.

origin: el remoto principal, generalmente tu copia del repositorio.
upstream: el repositorio original cuando trabajas con un fork.

**Ver remotos:**

  *git remote -v*

**Agregar upstream:**

  *git remote add upstream URL*

**Traer actualizaciones del original:**

  *git fetch upstream*

**Actualizar tu rama main:**

  *git switch main*
  *git merge upstream/main*

**Enviar tus cambios a tu fork:**

  *git push origin tu-rama*

# 14. Ver historial y diferencias: git log, git diff y git show

**Historial:**

  *git log*

**Vista compacta:**

  *git log --oneline --graph --decorate --all*

**Comparación de cambios:**

- Cambios no preparados:

*git diff*

- Cambios preparados:

*git diff --staged*

- Entre commits: 

*git diff COMMIT1 COMMIT2*

- Ver detalles completos de un commit:

*git show ID*

- Ver quién modificó cada línea:

*git blame archivo*

