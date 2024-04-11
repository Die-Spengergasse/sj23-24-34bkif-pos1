const { faker } = require('@faker-js/faker');
for (let i = 0; i < 108; i++) {
    console.log(`${faker.animal.type()};${faker.animal.type()}`);
}
