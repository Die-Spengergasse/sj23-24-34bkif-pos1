const faker = require('@faker-js/faker');
const fakerDE = faker.fakerDE_AT;
debugger;
for (let i = 1; i < 50; i++) {
    const sex = fakerDE.person.sexType();
    const firstName = fakerDE.person.firstName({ sex: sex });
    const fullName = fakerDE.person.fullName({
        sex: sex,
        firstName: firstName
    });
    const lastName = fullName.split(' ').at(-1);
    console.log(
        `${fullName};${fakerDE.internet
            .email({
                firstName: firstName,
                lastName: lastName
            })
            .toLocaleLowerCase()};${fakerDE.phone.number()};${fakerDE.location.streetAddress()}, ${fakerDE.location.city()}, ${fakerDE.location.state()}`
    );
}
