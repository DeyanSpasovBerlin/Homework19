import java.sql.*;


public class Homework19Zada4a2 {
    private double price;
    private String model;
    private Integer year;
    private String country;
    private  String city;
    private Boolean active;
    public Homework19Zada4a2(String model,double price,String country,String city,Integer year, Boolean active) {
        this.model = model;
        this.price = price;
        this.year = year;
        this.country = country;
        this.city = city;
        this.active = active;
    }

    public Homework19Zada4a2() {
    }
    public String toString(){
        return "Car:"+this.model+" and price: "+this.price;
    }
    public String getModel(){
        this.model = model;
        return model;
    }
    public double getPrice(){
        this.price = price;
        return price;
    }
    public void printZad2(){
        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection con=DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/Car","Shisho","what1960");
//here Car is database name, Shisho is username and password  what1960
            Statement stmt=con.createStatement();
            stmt.executeUpdate("create table ACCOUNTS " +
                    " (ID INTEGER(10) NOT NULL PRIMARY KEY, " +
                    " Model VARCHAR(32), " +
                    " Price FLOAT )"+"country VARCHAR(32),"+"city VARCHAR(32),"+ "year INTEGER(4), "+" active BOOLEAN");
            System.out.println("carModelPrice table created.");
            stmt.executeUpdate("insert into carModelPrice values " +
                    " (1, 'BMV', 4.0, 'Germany', 'Berlin', 2011, true) ");
            stmt.executeUpdate("insert into ACCOUNTS values " +
                    " (2, 'Mercedes', 6.0, 'Germany', 'Hamburg', 2009, true)");
            stmt.executeUpdate("insert into carModelPrice values " +
                    " (3, 'AUDI', 3.0, 'Germany', 'Munchen', null, false)");
            stmt.executeUpdate("insert into carModelPrice values " +
                    " (4, 'Porshe', 3.8, 'Germany', 'Dresden', 2003, true)");
            stmt.executeUpdate("insert into carModelPrice values " +
                    " (5, 'Jaguar', 5.0, 'England', 'Brandenburg', null, false)");
            System.out.println("Rows added.");
            ResultSet rs=stmt.executeQuery("select * from carModelPrice WHERE year IS NOT NULL AND (price BETWEEN 3.7 AND 4.7)");
            while(rs.next())
                System.out.println(rs.getInt(1)+"  "+ ((ResultSet) rs).getString(2)+"  "+rs.getString(3)+" " +
                                ((ResultSet) rs).getString(4)+""+ ((ResultSet) rs).getString(5)+" "+((ResultSet)rs).getString(6)+" "+((ResultSet)rs).getString(7));

            con.close();
        }catch(Exception e){ System.out.println(e);}
    }
}
