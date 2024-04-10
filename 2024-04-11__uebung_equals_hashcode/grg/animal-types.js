const { faker } = require('@faker-js/faker');

Array.from(new Array(100))
    .fill()
    .forEach(() => {
        console.log(faker.animal.type());
    });
