/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.sistem_manajemen_event_kampus_tiketing;

/**
 *
 * @author A c e r
 */
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.control.ComboBox;
import javafx.scene.control.ScrollPane;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;
import javafx.scene.layout.HBox;
import javafx.scene.layout.GridPane;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Separator;

import java.util.ArrayList;

public class MainJavaFX extends Application {

    @Override
    public void start(Stage primaryStage) {

        // 1. Membuat objek Event
        SeminarEvent seminarEvent = new SeminarEvent(
            "Seminar Teknologi AI",
            "Seminar",
            "18 September 2026",
            "Gedung Ilmu Komputer Lt.3",
            "Dr. Budi Santoso"
        );

        WorkshopEvent workshopEvent = new WorkshopEvent(
            "Workshop Pemrograman Java",
            "Workshop",
            "20 September 2026",
            "Gedung MIPA Terpadu",
            "Pemrograman Java Dasar"
        );

        // 2. Membuat ArrayList untuk menyimpan peserta
        ArrayList<Peserta> daftarPeserta = new ArrayList<>();

        // 3. Membuat objek Tiket
        Tiket tiket = new Tiket("Reguler", 25000);

        // 4. Membuat header aplikasi
        Label judul = new Label(
            "SISTEM MANAJEMEN EVENT KAMPUS"
        );

        judul.setStyle(
            "-fx-font-size: 22px;" +
            "-fx-font-weight: bold;"
        );

        judul.setMaxWidth(Double.MAX_VALUE);
        judul.setAlignment(Pos.CENTER);

        Label subjudul = new Label(
            "Temukan Event Kampus dan Daftarkan Dirimu!"
        );

        subjudul.setMaxWidth(Double.MAX_VALUE);
        subjudul.setAlignment(Pos.CENTER);

        // 5. Informasi Seminar
        Label seminar = new Label(
            seminarEvent.getNamaEvent() + "\n" +
            "Kategori: " + seminarEvent.getKategori() + "\n" +
            "Tanggal: " + seminarEvent.getTanggal() + "\n" +
            "Lokasi: " + seminarEvent.getLokasi() + "\n" +
            "Pembicara: " + seminarEvent.getPembicara()
        );

        seminar.setWrapText(true);
        seminar.setMaxWidth(300);

        // 6. Informasi Workshop
        Label workshop = new Label(
            workshopEvent.getNamaEvent() + "\n" +
            "Kategori: " + workshopEvent.getKategori() + "\n" +
            "Tanggal: " + workshopEvent.getTanggal() + "\n" +
            "Lokasi: " + workshopEvent.getLokasi() + "\n" +
            "Materi: " + workshopEvent.getMateri()
        );

        workshop.setWrapText(true);
        workshop.setMaxWidth(300);

        // 7. GridPane untuk informasi Event
        GridPane dataEvent = new GridPane();

        dataEvent.setHgap(25);
        dataEvent.setVgap(10);

        dataEvent.add(seminar, 0, 0);
        dataEvent.add(workshop, 1, 0);

        // 8. Membuat kolom Informasi Event
        VBox kolomEvent = new VBox(15);

        kolomEvent.getChildren().addAll(
            new Label("INFORMASI EVENT"),
            dataEvent
        );

        kolomEvent.setPadding(new Insets(15));
        kolomEvent.setStyle(
            "-fx-background-color: #F3F6FA;" +
            "-fx-border-color: #D0D7E2;" +
            "-fx-border-radius: 8;" +
            "-fx-background-radius: 8;"
        );

        // 9. Membuat kolom Informasi Tiket
        Label informasiTiket = new Label(
            "Jenis Tiket: " + tiket.getJenisTiket() + "\n" +
            "Harga Tiket: Rp" + tiket.getHarga() + "\n\n" +
            "Silakan lakukan pendaftaran " +
            "untuk mengikuti event yang tersedia."
        );

        informasiTiket.setWrapText(true);

        VBox kolomTiket = new VBox(15);

        kolomTiket.getChildren().addAll(
            new Label("INFORMASI TIKET"),
            informasiTiket
        );

        kolomTiket.setPadding(new Insets(15));
        kolomTiket.setStyle(
            "-fx-background-color: #F3F6FA;" +
            "-fx-border-color: #D0D7E2;" +
            "-fx-border-radius: 8;" +
            "-fx-background-radius: 8;"
        );

        // 10. Menggabungkan dua kolom informasi
        HBox bagianInformasi = new HBox(20);

        bagianInformasi.getChildren().addAll(
            kolomEvent,
            kolomTiket
        );

        kolomEvent.setPrefWidth(570);
        kolomTiket.setPrefWidth(230);

        // 11. Menggabungkan judul dan informasi ke header
        VBox header = new VBox(12);

        header.setAlignment(Pos.CENTER);
        header.setPadding(new Insets(20));

        Separator garis = new Separator();

        header.getChildren().addAll(
            judul,
            subjudul,
            garis,
            bagianInformasi
        );

        // 12. Membuat formulir pendaftaran
        TextField inputNama = new TextField();
        inputNama.setPromptText("Masukkan nama lengkap");

        TextField inputNpm = new TextField();
        inputNpm.setPromptText("Masukkan NPM");

        TextField inputProdi = new TextField();
        inputProdi.setPromptText("Masukkan program studi");

        // 13. Membuat pilihan Event
        ComboBox<String> pilihEvent = new ComboBox<>();

        pilihEvent.getItems().addAll(
            seminarEvent.getNamaEvent(),
            workshopEvent.getNamaEvent()
        );

        pilihEvent.setPromptText("Pilih event");
        pilihEvent.setMaxWidth(Double.MAX_VALUE);

        // 14. Menyusun formulir menggunakan GridPane
        GridPane formulir = new GridPane();

        formulir.setHgap(15);
        formulir.setVgap(12);

        formulir.add(new Label("Nama Lengkap"), 0, 0);
        formulir.add(inputNama, 1, 0);

        formulir.add(new Label("NPM"), 0, 1);
        formulir.add(inputNpm, 1, 1);

        formulir.add(new Label("Program Studi"), 0, 2);
        formulir.add(inputProdi, 1, 2);

        formulir.add(new Label("Pilih Event"), 0, 3);
        formulir.add(pilihEvent, 1, 3);

        // 15. Membuat tabel pendaftaran
        GridPane tabelPendaftaran = new GridPane();

        tabelPendaftaran.setHgap(0);
        tabelPendaftaran.setVgap(0);
        tabelPendaftaran.setPadding(new Insets(5));
        tabelPendaftaran.setMinWidth(900);

        // Judul kolom tabel
        tabelPendaftaran.add(
            buatCell("No.", 50, true), 0, 0
        );

        tabelPendaftaran.add(
            buatCell("Nama", 150, true), 1, 0
        );

        tabelPendaftaran.add(
            buatCell("NPM", 120, true), 2, 0
        );

        tabelPendaftaran.add(
            buatCell("Program Studi", 160, true), 3, 0
        );

        tabelPendaftaran.add(
            buatCell("Event", 180, true), 4, 0
        );

        tabelPendaftaran.add(
            buatCell("Tiket", 100, true), 5, 0
        );

        tabelPendaftaran.add(
            buatCell("Harga", 120, true), 6, 0
        );

        // ScrollPane untuk tabel
        ScrollPane tabelScrollPane = new ScrollPane();

        tabelScrollPane.setContent(tabelPendaftaran);

        tabelScrollPane.setHbarPolicy(
            ScrollPane.ScrollBarPolicy.AS_NEEDED
        );

        tabelScrollPane.setVbarPolicy(
            ScrollPane.ScrollBarPolicy.AS_NEEDED
        );

        tabelScrollPane.setFitToHeight(true);
        tabelScrollPane.setPrefViewportHeight(180);

        // 16. Label status pendaftaran
        Label statusPendaftaran = new Label(
            "Silakan isi formulir untuk mendaftar event."
        );

        statusPendaftaran.setWrapText(true);

        // 17. Membuat tombol pendaftaran
        Button btnDaftar = new Button("Daftar Event");

        // 18. Event Handling tombol Daftar Event
        btnDaftar.setOnAction(e -> {

            try {

                String nama = inputNama.getText().trim();
                String npm = inputNpm.getText().trim();
                String prodi = inputProdi.getText().trim();
                String eventDipilih = pilihEvent.getValue();

                // Memeriksa kelengkapan formulir
                if (nama.isEmpty() ||
                    npm.isEmpty() ||
                    prodi.isEmpty() ||
                    eventDipilih == null) {

                    statusPendaftaran.setText(
                        "PENDAFTARAN BELUM BERHASIL!\n" +
                        "Silakan lengkapi seluruh formulir."
                    );

                    return;
                }

                // Memeriksa agar NPM tidak terdaftar dua kali
                for (Peserta peserta : daftarPeserta) {

                    if (peserta.getNpm().equals(npm)) {

                        statusPendaftaran.setText(
                            "PENDAFTARAN GAGAL!\n" +
                            "NPM tersebut sudah terdaftar."
                        );

                        return;
                    }
                }

                // Membuat objek peserta baru
                Peserta pesertaBaru = new Peserta(
                    nama,
                    npm,
                    prodi
                );

                // Menyimpan peserta ke ArrayList
                daftarPeserta.add(pesertaBaru);

                // Menentukan nomor baris
                int nomor = daftarPeserta.size();

                // Menambahkan data ke tabel
                tabelPendaftaran.add(
                    buatCell(String.valueOf(nomor), 50, false),
                    0, nomor
                );

                tabelPendaftaran.add(
                    buatCell(pesertaBaru.getNama(), 150, false),
                    1, nomor
                );

                tabelPendaftaran.add(
                    buatCell(pesertaBaru.getNpm(), 120, false),
                    2, nomor
                );

                tabelPendaftaran.add(
                    buatCell(pesertaBaru.getProdi(), 160, false),
                    3, nomor
                );

                tabelPendaftaran.add(
                    buatCell(eventDipilih, 180, false),
                    4, nomor
                );

                tabelPendaftaran.add(
                    buatCell(tiket.getJenisTiket(), 100, false),
                    5, nomor
                );

                tabelPendaftaran.add(
                    buatCell("Rp" + tiket.getHarga(), 120, false),
                    6, nomor
                );

                // Menampilkan konfirmasi
                statusPendaftaran.setText(
                    "PENDAFTARAN BERHASIL!\n" +
                    "Terima kasih telah mendaftar event."
                );

                // Mengosongkan formulir
                inputNama.clear();
                inputNpm.clear();
                inputProdi.clear();
                pilihEvent.setValue(null);

            } catch (Exception ex) {

                statusPendaftaran.setText(
                    "Terjadi kesalahan: " + ex.getMessage()
                );

            }

        });

        // 19. Membuat konten utama
        VBox content = new VBox(20);

        content.getChildren().addAll(
            new Label("FORMULIR PENDAFTARAN"),
            formulir,

            btnDaftar,
            statusPendaftaran,

            new Label("DATA PENDAFTARAN"),
            tabelScrollPane
        );

        content.setPadding(new Insets(20));

        // 20. Membuat ScrollPane utama
        ScrollPane scrollPane = new ScrollPane();

        scrollPane.setContent(content);
        scrollPane.setFitToWidth(true);

        scrollPane.setHbarPolicy(
            ScrollPane.ScrollBarPolicy.NEVER
        );

        // 21. Membuat BorderPane
        BorderPane root = new BorderPane();

        root.setTop(header);
        root.setCenter(scrollPane);

        // 22. Membuat Scene dan Stage
        Scene scene = new Scene(root, 900, 800);

        primaryStage.setTitle(
            "Sistem Manajemen Event Kampus"
        );

        primaryStage.setScene(scene);
        primaryStage.setMinWidth(750);
        primaryStage.setMinHeight(600);
        primaryStage.show();
    }

    // Method untuk membuat setiap sel tabel
    private Label buatCell(
        String teks,
        double lebar,
        boolean header
    ) {

        Label cell = new Label(teks);

        cell.setMinWidth(lebar);
        cell.setPrefWidth(lebar);
        cell.setWrapText(true);
        cell.setPadding(new Insets(8));

        if (header) {

            cell.setStyle(
                "-fx-font-weight: bold;" +
                "-fx-background-color: #DCE6F1;" +
                "-fx-border-color: #AAB7C4;" +
                "-fx-border-width: 0 1 1 0;"
            );

        } else {

            cell.setStyle(
                "-fx-background-color: white;" +
                "-fx-border-color: #D0D0D0;" +
                "-fx-border-width: 0 1 1 0;"
            );

        }

        return cell;
    }

    public static void main(String[] args) {
        launch(args);
    }
}