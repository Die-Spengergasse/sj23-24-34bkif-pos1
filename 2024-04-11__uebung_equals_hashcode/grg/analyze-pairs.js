const fs = require('fs');
const readline = require('readline');

async function processLineByLine() {
    const fileStream = fs.createReadStream('../paare.csv');

    const rl = readline.createInterface({
        input: fileStream,
        crlfDelay: Infinity,
    });

    for await (const line of rl) {
        // Each line in the input.txt will be successively available here as `line`.
        const pair = line.split(';');
        console.log(pair.toSorted().join(';'));
    }
}

processLineByLine();
