package com.italo.Spring_JDBC;

import com.italo.Spring_JDBC.models.client;
import com.italo.Spring_JDBC.services.clientService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.util.List;
import java.util.Scanner;

@SpringBootApplication
public class SpringJdbcApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(SpringJdbcApplication.class, args);

		clientService clientService = context.getBean(clientService.class);
		Scanner scanner = new Scanner(System.in);

		while (true) {
			System.out.println("\n=== main menu ===");
			System.out.println("1. Add Client");
			System.out.println("2. View Clients");
			System.out.println("3. Update Client");
			System.out.println("4. Delete Client");
			System.out.println("0. Exit");
			System.out.print("Choose an option: ");
			int choice = scanner.nextInt();
			scanner.nextLine();

			switch (choice) {
				case 1:
					client cli = new client();

					System.out.print("Write the Client ID: ");
					cli.setClientId(scanner.nextInt());
					scanner.nextLine();

					System.out.print("Write the Client name: ");
					cli.setName(scanner.nextLine());

					System.out.print("Write the Client age: ");
					cli.setAge(scanner.nextInt());
					scanner.nextLine();

					clientService.addClient(cli);
					System.out.println("Client added successfully!!");
					break;

				case 2:
					List<client> lstClients = clientService.getClients();
					System.out.println("\n=== List of Clients ===");
					lstClients.forEach(c -> System.out.println(c));
					break;

				case 3:
					client updateCli = new client();

					System.out.print("Write the ID of the client you want to update: ");
					updateCli.setClientId(scanner.nextInt());
					scanner.nextLine();

					System.out.print("Write the new name for the client: ");
					updateCli.setName(scanner.nextLine());

					System.out.print("Write the ne age for the client: ");
					updateCli.setAge(scanner.nextInt());
					scanner.nextLine();

					clientService.updateClient(updateCli);
					System.out.println("Client updated successfully!");
					break;

				case 4:
					System.out.print("Write the ID of the client you want to delete: ");
					int clientId = scanner.nextInt();
					scanner.nextLine();

					clientService.deleteClient(clientId);
					System.out.println("Client  deleted successfully!");
					break;

				case 0:
					System.out.println("Exiting...");
					scanner.close();
					System.exit(0);
					break;

				default:
					System.out.println("Invalid Option. Try again.");
			}
		}
	}
}
