const { faker } = require('@faker-js/faker');
console.log(`Name;Unterart;Art;`);
for (let i = 0; i < 100; i++) {
    const type = faker.animal.type();
    const name = faker.person.firstName();
    console.log(`${name};${faker.animal[type]()};${type};`);
}
