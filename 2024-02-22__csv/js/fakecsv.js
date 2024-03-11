const { fakerDE, fakerEN } = require('@faker-js/faker');
for (let i = 0; i < 1000; i++) {
    const sex = fakerEN.person.sex();
    const fullName = fakerDE.person.fullName({ sex: sex });
    console.log(
        `${fakerDE.string.uuid()};${fullName};${sex};${
            fakerDE.number.int({ min: 100, max: 235 }) / 100
        };${fakerDE.number.int({ min: 35, max: 170 })}`
    );
}
