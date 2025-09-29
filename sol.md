# Práctica 2.0 Desarrollo de interfaces: Cómo clonar, modificar y subir un repositorio en GitHub

El objetivo de esta práctica es familiarizarte con GitHub Classroom, Git/GitHub Desktop y GitHub CLI, y aprender a documentar proyectos usando el lenguaje Markdown.

## 1. Clonar el repositorio

Antes de comenzar, es recomendable tener instalado Git en el equipo, así como un IDE en el que puedas trabajar.
En el caso de GitHub, es posible trabajar directamente sobre la interfaz, pero siempre es mejor si tienes tus trabajos en local.
Una vez esté todo instalado, se debe hacer un **git clone** seguido con la dirección url del repositorio que queremos clonar
(esto para http, para ssh necesitaremos claves públicas y privadas).

![](/./media/clone.png)

- [GitHub de Desarrollo de interfaces](https://github.com/adono-ma/DAM2-DI)

Si queremos que se guarde con otro nombre, tras el enlace, ponemos el nombre que queramos, separado por un espacio.

```bash
gh git clone [url] nombre
```

## 2: Git add & commit

Una vez clonado el repositorio, lo modificamos como queramos.Para que estos cambios se vean reflejados, hay que seguir una serie de pasos:
1. *git add* puede ir seguido de un punto, que añadiría todos los archivos de nuestra carpeta actual (el repositorio) a lo que queremos actualizar,
o únicamente el nombre del archivo (o archivos) que queramos subir al repositorio.

```bash
gh git add .
```

2. *git commit -m \[descripción de nuestra actualización\]* es importante que se sepa qué cambios hemos realizado en el repositorio,
ya sea para que podamos encontrarlo nosotros, o para que otra persona que esté trabajando en el proyecto, pueda entender qué ha ocurrido en esos cambios.

```bash
gh git commit -m "mi commit"
```

## 3: Subir el repositorio
A pesar de haber seguido los pasos anteriores, nuestro repositorio aún no estará actualizado, es necesario un último paso:
*git push* subirá nuestro commit, actualizando así el repositorio.

```bash
gh git push
```

- Para verificar si nuestros archivos locales están actualizados, podemos utilizar *git status*, que nos dirá qué archivos han cambiado respecto al repositorio en remoto.

```bash
gh git status
```

- Para actualizar el repositorio local con el remoto, se realizará un *git pull*. Pero este sobreescribirá lo que teníamos ya en local, por lo que hay que tener cuidado.
```bash
gh git pull
```

Esta es una tabla con los comandos básicos de git:

| Comando | Descripción |
|---------|-------------|
| `git init` | Inicializa un nuevo repositorio en la carpeta actual. |
| `git clone <url>` | Clona un repositorio remoto en local. |
| `git status` | Muestra el estado actual de los archivos (cambios, staged, sin seguimiento). |
| `git add <archivo>` | Añade un archivo específico al área de preparación (staging). |
| `git add .` | Añade todos los cambios al área de preparación. |
| `git commit -m "mensaje"` | Registra los cambios en el repositorio con un mensaje. |
| `git log` | Muestra el historial de commits. |
| `git diff` | Muestra los cambios realizados que aún no están en el área de preparación. |
| `git branch` | Lista las ramas existentes. |
| `git branch <nombre>` | Crea una nueva rama. |
| `git checkout <rama>` | Cambia a una rama existente. |
| `git merge <rama>` | Fusiona la rama especificada en la actual. |
| `git remote -v` | Muestra los repositorios remotos configurados. |
| `git push origin <rama>` | Sube los cambios al repositorio remoto. |
| `git pull origin <rama>` | Descarga y aplica los cambios del remoto en la rama actual. |
| `git reset --hard <commit>` | Revierte el repositorio al commit indicado (¡peligroso, borra cambios!). |
| `git stash` | Guarda cambios temporales sin hacer commit. |
| `git stash pop` | Recupera los cambios guardados con `stash`. |

---

>- Puedes utilizar `git --help` o `git <comando> --help` para obtener más información sobre cualquier comando.



