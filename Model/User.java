    import java.util.Random;

    public abstract class User {
        Random random = new Random();
        private long id = (long)random.nextInt() + (long) (1L << 31);
        private String firstName;
        private String lastName;
        private String email;
        private String IBAN;
        private String username;
        private String password;



        User(String firstName, String lastName, String email, String IBAN, String username, String password){
            this.firstName=firstName;
            this.lastName=lastName;
            this.email=email;
            this.IBAN=IBAN;
            this.username=username;
            this.password=password;
        }

        public long getId(){
            return id;
        }

        public void setFirstName(String firstName){
            this.firstName=firstName;
        }

        public String getFirstName(){
            return firstName;
        }

        public void setLastName(String lastName){
            this.lastName=lastName;
        }

        public String getLastName(){
            return lastName;
        }

        public void setEmail(String email){
            this.email=email;
        }

        public String getEmail(){
            return email;
        }

        public void setIBAN(String IBAN){
            this.IBAN=IBAN;
        }

        public String getIBAN(){
            return this.IBAN;
        }

        public void setUsername(String username){
            this.username=username;
        }

        public String getPassword() {
            return password;
        }

        public void setPassword(String password) {
            this.password = password;
        }

        public void remove(User user){}

        @Override
        public int hashCode() {
            final int prime = 31;
            int result = 1;
            result = prime * result + (int) (id ^ (id >>> 32));
            return result;
        }

        @Override
        public boolean equals(Object obj) {
            if (this == obj)
                return true;
            if (obj == null)
                return false;
            if (getClass() != obj.getClass())
                return false;
            User other = (User) obj;
            if (id != other.id)
                return false;
            return true;
        };

        
        

    }
