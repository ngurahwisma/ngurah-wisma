package com.example.kuliahonline;

public class Mobil {

        private String nama;
        private String merek;
        private String nodk;

        public Mobil(String nama, String merek, String nodk) {
            this.nama = nama;
            this.merek = merek;
            this.nodk = nodk;

        }

        public String getNama() {
            return nama;
        }

        public void setNama(String nama) {
            this.nama = nama;
        }

        public String getMerek() {
            return merek;
        }

        public void setMerek(String merek) {
            this.merek = merek;
        }

        public String getNodk() {
            return nodk;
        }

        public void setNodk(String nodk) {
            this.nodk = nodk;
        }
}
