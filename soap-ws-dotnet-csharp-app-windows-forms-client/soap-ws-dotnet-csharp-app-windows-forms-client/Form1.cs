using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;
using soap_ws_dotnet_csharp_app_windows_forms_client.BankServiceReference;


namespace soap_ws_dotnet_csharp_app_windows_forms_client
{

    public partial class Form1 : Form
    {
        private BankServiceClient stub;

        public Form1()
        {
            InitializeComponent();
            stub = new BankServiceReference.BankServiceClient();

        }

        private void label1_Click(object sender, EventArgs e)
        {

        }

        private void label2_Click(object sender, EventArgs e)
        {

        }

        private void button1_Click(object sender, EventArgs e)
        {
            try
            {
                double amount = Double.Parse(textBox1.Text);
                textBox2.Text = stub.Convert_USD_to_MAD(amount).ToString();
            }
            catch(Exception ex)
            {
                MessageBox.Show(ex.Message);
            }
            
        }

        private void button2_Click(object sender, EventArgs e)
        {
            account[] accounts = stub.AccountsList();
            DataTable dataTable = new DataTable();
            dataTable.Columns.Add("Id");
            dataTable.Columns.Add("Balance");
            dataTable.Columns.Add("Creation Date");
            foreach (account accnt in accounts)
            {
                dataTable.Rows.Add(accnt.Id, accnt.Balance,accnt.CreationDate);
            }
            dataGridView1.DataSource = dataTable;
        }

        private void button3_Click(object sender, EventArgs e)
        {
            Random random = new Random();
            int accountId = random.Next(1, 100);
            account account = stub.getAccount(accountId);
            DataTable dataTable = new DataTable();
            dataTable.Columns.Add("Id");
            dataTable.Columns.Add("Balance");
            dataTable.Columns.Add("Creation Date");
            dataTable.Rows.Add(account.Id, account.Balance, account.CreationDate);  
            dataGridView1.DataSource = dataTable;
        }
    }
}
