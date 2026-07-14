# 🔐 Password Cracker

An educational Java project that demonstrates two common password cracking techniques:

- 📖 Dictionary Attack
- 💥 Brute Force Attack

The application uses **SHA-256** hashing and compares generated hashes with target hashes stored in a file. It was developed to better understand password hashing, brute-force attacks, recursion, and basic cybersecurity concepts.

---

## ✨ Features

- SHA-256 password hashing using `MessageDigest`
- Dictionary Attack
- Brute Force Attack
- Recursive password generation
- Performance statistics
  - Number of attempts
  - Elapsed time
  - Hashes per second
- Reads passwords and hashes from text files

---

## 📂 Project Structure

```
src/
│
├── Main.java
├── HashUtil.java
├── FileUtil.java
├── DictionaryCracker.java
├── BruteForceCracker.java
└── CrackResult.java

dictionary.txt
hashes.txt
```

---

## 🚀 How It Works

1. Read the dictionary from `dictionary.txt`.
2. Read target hashes from `hashes.txt`.
3. Try to crack each hash using a **Dictionary Attack**.
4. If the password is not found, switch to **Brute Force Attack**.
5. Display:
   - Cracked password
   - Attack method
   - Number of attempts
   - Elapsed time
   - Hashes per second

---

## 📌 Example Output

```
========================================
Hash         : 8c6976...
Method       : Dictionary Attack
Password     : admin
Attempts     : 3
Time         : 0.000021 s
Hashes/sec   : 142857.14
========================================
```

---

## 🔒 Security Notes

### Why are hash functions one-way?

Hash functions such as SHA-256 convert data into a fixed-length value. The original password cannot be recovered directly from its hash.

### What is a Salt?

A salt is a random value added to a password before hashing. It prevents attackers from using rainbow tables and ensures identical passwords produce different hashes.

### Why isn't SHA-256 enough for password storage?

SHA-256 is designed to be fast. Modern computers can calculate millions of SHA-256 hashes every second, making brute-force attacks much easier.

For real-world applications, password hashing algorithms such as:

- BCrypt
- PBKDF2
- Argon2

should be used instead.

---

## 🛠 Technologies

- Java
- SHA-256 (`MessageDigest`)
- Recursion
- File I/O
- Object-Oriented Programming (OOP)

---

## 📚 Educational Purpose

This project was developed for learning purposes to understand:

- Password hashing
- Dictionary attacks
- Brute-force attacks
- Recursive algorithms
- Performance measurement
- Java OOP concepts
