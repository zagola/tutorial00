## database

Building a docker with database.

```
$ docker pull postgres
$ docker build -t tutorial00_db .
$ docker run -d -p5432:5432 tutorial00_db

```

Connecting to database

```
$ psql -h localhost -p 5432  -U ola  tutorial00

```