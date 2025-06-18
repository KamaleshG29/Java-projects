import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.stage.Stage;

public class StudentForm extends Application {

    @Override
    public void start(Stage primaryStage) {
        // GridPane layout
        GridPane grid = new GridPane();
        grid.setVgap(10);
        grid.setHgap(10);
        grid.setStyle("-fx-padding: 20;");

        // Labels and TextFields
        Label nameLabel = new Label("Name:");
        
        TextField nameField = new TextField();

        Label rollLabel = new Label("Roll Number:");
        TextField rollField = new TextField();

        Label courseLabel = new Label("Course:");
        TextField courseField = new TextField();

        Label semLabel = new Label("Semester:");
        TextField semField = new TextField();

        Label emailLabel = new Label("Email:");
        TextField emailField = new TextField();

        Label phoneLabel = new Label("Phone:");
        TextField phoneField = new TextField();

        Button insertButton = new Button("Insert");

        // Add to GridPane
        grid.add(nameLabel, 0, 0);      grid.add(nameField, 1, 0);
        grid.add(rollLabel, 0, 1);      grid.add(rollField, 1, 1);
        grid.add(courseLabel, 0, 2);    grid.add(courseField, 1, 2);
        grid.add(semLabel, 0, 3);       grid.add(semField, 1, 3);
        grid.add(emailLabel, 0, 4);     grid.add(emailField, 1, 4);
        grid.add(phoneLabel, 0, 5);     grid.add(phoneField, 1, 5);
        grid.add(insertButton, 1, 6);

        // Insert button action (example)
        insertButton.setOnAction(e -> {
            String name = nameField.getText();
            String roll = rollField.getText();
            String course = courseField.getText();
            String sem = semField.getText();
            String email = emailField.getText();
            String phone = phoneField.getText();

            // Just printing values for now
            System.out.println("Name: " + name);
            System.out.println("Roll: " + roll);
            System.out.println("Course: " + course);
            System.out.println("Semester: " + sem);
            System.out.println("Email: " + email);
            System.out.println("Phone: " + phone);
        });

        // Set scene and show
        Scene scene = new Scene(grid, 400, 350);
        primaryStage.setTitle("Student Entry Form");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class InsertDataJDBC {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/student";
        String user = "root";
        String password = "root"; // Use your MySQL password

        try {
            Connection conn = DriverManager.getConnection(url, user, password);

            String query = "INSERT INTO students (id, name, marks) VALUES (?, ?, ?)";
            PreparedStatement pstmt = conn.prepareStatement(query);

            pstmt.setInt(1, 1);             // id
            pstmt.setString(2, "Kamalesh"); // name
            pstmt.setInt(3, 90);            // marks

            int rows = pstmt.executeUpdate();
            if (rows > 0) {
                System.out.println("Data inserted successfully.");
            }

            conn.close();
        } catch (Exception e) {
            System.out.println("Insertion failed.");
            e.printStackTrace();
        }
    }
}

package demo;

public class AVLTreeSimple {

    class Node {
        int key;
        int height;
        Node left, right;

        public Node(int value) {
            key = value;
            height = 1;
        }
    }

    Node root;

    public int height(Node n) {
        if (n == null) return 0;
        return n.height;
    }

    int getBalance(Node n) {
        if (n == null) return 0;
        return height(n.left) - height(n.right);
    }

    Node rightRotate(Node y) {
        Node x = y.left;
        Node T2 = x.right;

        x.right = y;
        y.left = T2;

        y.height = Math.max(height(y.left), height(y.right)) + 1;
        x.height = Math.max(height(x.left), height(x.right)) + 1;

        return x;
    }

    Node leftRotate(Node x) {
        Node y = x.right;
        Node T2 = y.left;

        y.left = x;
        x.right = T2;

        x.height = Math.max(height(x.left), height(x.right)) + 1;
        y.height = Math.max(height(y.left), height(y.right)) + 1;

        return y;
    }

    Node insert(Node node, int key) {
        if (node == null) {
            return new Node(key);
        }

        if (key < node.key) {
            node.left = insert(node.left, key);
        } else if (key > node.key) {
            node.right = insert(node.right, key);
        } else {
            // Duplicate keys not allowed
            return node;
        }

        node.height = 1 + Math.max(height(node.left), height(node.right));
        int balance = getBalance(node);

        // Left Left Case
        if (balance > 1 && key < node.left.key)
            return rightRotate(node);

        // Right Right Case
        if (balance < -1 && key > node.right.key)
            return leftRotate(node);

        // Left Right Case
        if (balance > 1 && key > node.left.key) {
            node.left = leftRotate(node.left);
            return rightRotate(node);
        }

        // Right Left Case
        if (balance < -1 && key < node.right.key) {
            node.right = rightRotate(node.right);
            return leftRotate(node);
        }

        return node;
    }

    void insert(int key) {
        root = insert(root, key);
    }

    void printInorder(Node node) {
        if (node != null) {
            printInorder(node.left);
            System.out.print(node.key + " ");
            printInorder(node.right);
        }
    }

    public static void main(String[] args) {
        AVLTreeSimple tree = new AVLTreeSimple();
        tree.insert(10);
        tree.insert(20);
        tree.insert(30);
        tree.insert(40);
        tree.insert(50);
        tree.insert(25);
        System.out.println("Inorder of AVL Tree:");
        tree.printInorder(tree.root);
    }
}
