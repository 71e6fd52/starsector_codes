The algorithm is obtained by decompiling the game file.

## Usage

compile with:

```sh
javac codes.java starsector_codes.java
```

and run

```sh
java StarsectorCodes
```

above command will print all code, better use

```sh
java StarsectorCodes | head
```

to get first 10 codes, or

```sh
java StarsectorCodes | head -n $RANDOM | tail -n 1
```

to get random one
