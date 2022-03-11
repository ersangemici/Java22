package com.tatsumaki;

public class Category {
        private String category_Name;

        public Category(int ID, String category_Name) {
            ID = User.create_Id();
            this.category_Name = "";

        }

        public String category_Listing(String value) {
            category_Name = value;
            return category_Name;
        }
    }

