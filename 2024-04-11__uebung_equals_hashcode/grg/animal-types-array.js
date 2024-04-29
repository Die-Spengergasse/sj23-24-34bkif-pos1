const { faker } = require('@faker-js/faker');
console.log(`Name;Unterart;Art;`);
for (let i = 0; i < 10000; i++) {
    const name = faker.person.firstName();
    const type = faker.animal.type();
    console.log(`${name};${faker.animal[type]()};${type};`);
}
