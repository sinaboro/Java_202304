package button;

import button.Button.ClickListener;

public class Example {
	public static void main(String[] args) {
		Button btnOk = new Button();
		btnOk.setClickListener(new ClickListener() {
			@Override
			public void onClick() {
				System.out.println("Ok버튼을 클릭했습니다.");
			}
		});
		btnOk.click();
		
		Button btnCancel = new Button();
		btnCancel.setClickListener(
				()-> System.out.println("Cancel 버튼을 클릭했씁니다.")
		);
		btnCancel.click();
	}
}
