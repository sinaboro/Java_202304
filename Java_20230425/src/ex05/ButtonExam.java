package ex05;

public class ButtonExam {

	public static void main(String[] args) {
		Button btnOk = new Button();
		
		class OkListener implements Button.ClickListener{

			@Override
			public void onClick() {
				System.out.println("Ok 버튼을 클릭했습니다.");
			}
		}
		
		btnOk.setClickListener(new OkListener());
		btnOk.click();

		Button btnCancel = new Button();
		class CancelListener implements Button.ClickListener{

			@Override
			public void onClick() {
				System.out.println("Cancel 버튼을 클릭했습니다.");
			}
		}
		
		btnCancel.setClickListener(new CancelListener());
		btnCancel.click();
		
		Button DoublebtnOk = new Button();
		class DoubleListener implements Button.ClickListener{
			
			@Override
			public void onClick() {
				System.out.println("더블 클릭했습니다.");
			}
		}
		
		DoublebtnOk.setClickListener(new DoubleListener());
		DoublebtnOk.click();
		
		
		
		
	}
		
		

}
