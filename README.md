# Tic Tac Toe

This repository is a final project (Java GUI) from Object-Oriented Programming Class, Teknik Informatika Universitas Padjadjaran. 

[Challenge Guidelines](challenge-guideline.md)

**Permainan Tic Tac Toe sederhana layaknya Tic Tac Toe tradisional biasa. Menggunakan bahasa java sesuai yang dipelajari dan styling dengan Java GUI. Dibutuhkan 2 pemain dalam game sebagai player X dan player O, diusahakan dapat meng-input nama pemain (sehingga nama pemain bukan hanya X dan O). Peraturan standar : 3 kotak sebaris (horizontal/vertikal/diagonal) terisi huruf yang sama (ketiganya X atau ketiganya O) == menang. Jika semua kotak telah terisi namun tidak ada yang membentuk baris maka hasilnya draw.**

## Credits
| NPM           | Name                      |
| ------------- | ------------------------- |
| 140810200034  | Anna Safira Dila          |
| 140810200036  | Laura Azra Aprilyanti     |
| 140810200042  | Andre Nathaniel Adipraja  |

## Change log
- **[Sprint Planning](changelog/sprint-planning.md) - (planning date)** 
   - Short changes 1
   - Short changes 2

- **[Sprint 1](changelog/sprint-1.md) - (date from 16/11/2021 until 23/11/2021)** 
   - Merancang Logika Tic Tac Toe CUI
   - Merancang Blueprint Layout Game

- **[Sprint 2](changelog/sprint-2.md) - (date from 23/11/2021 until 30/11/2021)** 
   - Implementasi Logika Tic Tac Toe
   - Implementasi Layout
   
- **[Sprint 3](changelog/sprint-3.md) - (date from 01/11/2021 until 07/11/2021)** 
   - Finishing Project
   - Testing the Project

## Running The App

Tata cara menjalankan aplikasi
1. Git clone dari repository lalu buka melalui VSCode
2. Buka terminal (bisa menggunakan terminal vscode, maupun gitbash)
3. Ketik 'gradle run' tanpa tanda petik lalu tekan tombol enter
4. Jendela aplikasi akan terbuka dengan ukuran 500x500 (saat ini belum ada opsi memperbesar window ataupun sebaliknya)
5. Ketika dibuka akan langsung muncul grid 3x3 dan jika di klik salah satu kotak akan muncul huruf x, dimana artinya x adalah player pertama
6. Lanjutkan dengan player kedua yaitu o hingga selesai
7. Selamat bermain!

## Classes Used

TicTacToeGUI2.java

UML image here

## Notable Assumption and Design App Details

<ul> Untuk mengisi kotak hanya dapat menggunakan mouse saja, tetapi untuk pop up box (JOption Pane) dapat menggunakan enter </ul>
<ul> Jika sudah terbentuk 1 garis dengan huruf yang sama, baik x maupun o, maka background grid garis tersebut akan berubah warna menjadi hijau </ul>
<ul> Terdapat tombol New Game dan Quit pada menu bar yang memungkinkan pemain untuk mengulang di tengah-tengah permainan </ul>
<ul> Setelah permainan berakhir, pemain dapat memilih untuk mengulang permainan atau keluar dari permainan </ul>
