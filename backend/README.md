# Amazon Shopping Application

## Database

### Local DB Setup
Make sure Docker is running and run the below commend to start up the db:

```bash
# runs a brand new instance of the database
$ docker run --name testdb -p 5432:5432 -e POSTGRES_PASSWORD=mysecretpassword -d postgres:15.3
```

### Create db schema
```
CREATE SCHEMA shopping
```

## Todo

- [ ] Hibernate Model - CRUD
- [ ] Flyway - Migration and Seed
- [ ] Testing
- [ ] Auth
- [ ] Validator