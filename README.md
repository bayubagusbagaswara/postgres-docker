Masuk ke Container PostgreSQL: Anda perlu masuk ke dalam kontainer yang menjalankan server PostgreSQL. Anda bisa melakukan ini dengan perintah:

docker-compose exec <nama_service_postgres> psql -U <nama_pengguna> -d <nama_database>

docker-compose exec db psql -U postgres -d mydatabase

Lihat Tabel: Setelah Anda masuk ke dalam kontainer PostgreSQL, Anda dapat menggunakan perintah SQL seperti \dt untuk melihat daftar tabel yang ada dalam database tersebut. Perintah ini akan menampilkan daftar semua tabel dalam database yang sedang digunakan.

Keluar dari PSQL dan Kontainer: Setelah selesai melihat tabel, Anda bisa keluar dari konsol PSQL dengan perintah \q, kemudian keluar dari kontainer dengan mengetik exit.