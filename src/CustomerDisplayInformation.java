public class CustomerDisplayInformation implements DisplayInFormation {
    private void displayRegistrationBanner() {
        System.out.printf("\n\n\n%60s ++++++++++++++ Welcome to the Customer Registration Portal ++++++++++++++", "");
    }


    private void displayCustomerFoundBanner() {
        System.out.printf("%-50sCustomer Found...!!! Here is the Full Record...!!!\n\n\n", " ");
    }

    private void displayCustomerNotFoundMessage(String ID) {
        System.out.printf("%-50sNo Customer with the ID %s Found...!!!\n", " ", ID);
    }

    private void displayCustomerData(Customer customer, int index) {
        System.out.println(customer.toString(index));
    }

    private void displayFooter() {
        System.out.printf(
                "%10s+------------+------------+----------------------------------+---------+-----------------------------+-------------------------------------+-------------------------+\n",
                "");
    }



    private void displayCustomerDeletedBanner(String ID) {
        System.out.printf("\n%-50sPrinting all Customer's Data after deleting Customer with the ID %s.....!!!!\n", "", ID);
    }



    void displayHeader() {
        System.out.println();
        System.out.printf(
                "%10s+------------+------------+----------------------------------+---------+-----------------------------+-------------------------------------+-------------------------+\n",
                "");
        System.out.printf(
                "%10s| SerialNum  |   UserID   | Passenger Names                  | Age     | EmailID\t\t       | Home Address\t\t\t     | Phone Number\t       |%n",
                "");
        System.out.printf(
                "%10s+------------+------------+----------------------------------+---------+-----------------------------+-------------------------------------+-------------------------+\n",
                "");
        System.out.println();

    }



}
