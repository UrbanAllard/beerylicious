# --- !Ups

CREATE TABLE beers (
    id long,
    name varchar,
    sort varchar,
    description varchar,
    country varchar,
    region varchar);

CREATE TABLE breweries(
    id long,
    name varchar,
    description varchar,
    country varchar,
    region varchar,
    beer_id long);
