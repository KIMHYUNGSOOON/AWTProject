package d0601;

import java.awt.FlowLayout;
import java.awt.CheckboxMenuItem;
import java.awt.Frame;
import java.awt.Menu;
import java.awt.MenuBar;
import java.awt.MenuItem;

public class MenuTest {
	public static void main(String[] args) {
		Frame f = new Frame("메모장");
		f.setSize(300, 200);
		f.setLayout(new FlowLayout());
		
		MenuBar mb = new MenuBar();
		Menu mFile = new Menu("파일(F)");
		MenuItem miNew = new MenuItem("새로 만들기(N)                                 Ctrl+N");
		MenuItem miOpen = new MenuItem("새 창(W)                                Ctrl+Shift+N");
		Menu mOthers = new Menu("열기(O)...                                  Ctrl+Shift+N");
		MenuItem miExit = new MenuItem("저장(S)                                     Ctrl++S");
		MenuItem miExit2 = new MenuItem("다른 이름으로 저장(A)...            Ctrl+Shift+S");
		MenuItem miExit3 = new MenuItem("페이지 설정(U)...                             ");
		MenuItem miExit4 = new MenuItem("인쇄(P)...                                      Ctrl+P");
		MenuItem miExit5 = new MenuItem("끝내기(X)                                    ");
		
		
		mFile.add(miNew);
		mFile.add(miOpen);
		mFile.add(mOthers);
		mFile.add(miExit);
		mFile.add(miExit2);
		mFile.addSeparator();
		mFile.add(miExit3);
		mFile.add(miExit4);
		mFile.addSeparator();
		mFile.add(miExit5);
		MenuItem miPrint = new MenuItem("Print...");
		MenuItem miPreview = new MenuItem("Print Preview");
		MenuItem miSetup = new MenuItem("Print Setup...");
		mOthers.add(miPrint);
		mOthers.add(miPreview);
		mOthers.add(miSetup);

		Menu mEdit = new Menu("편집(E)");

		MenuBar mi = new MenuBar();
		MenuItem miE = new MenuItem("실행취소(U)                 Ctl+Z");
		MenuItem miF = new MenuItem("잘라내기(T)                Ctrl+X");
		MenuItem miG = new MenuItem("복사(C)...                 Ctl+C");
		MenuItem miH = new MenuItem("붙여넣기(P)                 Ctl+V");
		MenuItem miI = new MenuItem("삭제(L)                      DEL");

		MenuItem miZ = new MenuItem("Bing으로 검색(S)...        Ctrl+E");
		MenuItem miX = new MenuItem("찾기(F)...                Ctrl+F");
		Menu miC = new Menu("다음 찾기(N)                           F3");
		MenuItem miB = new MenuItem("이전 찾기(V)             SHIFT+F3");
		MenuItem miN = new MenuItem("바꾸기(R)...              Ctrl+H");
		MenuItem miM = new MenuItem("이동(G)...               Ctrl+G");
		MenuItem mi0 = new MenuItem("모두 선택(A)               Ctrl+A");
		MenuItem miV = new MenuItem("시간/날짜(D)                   F5");

		mEdit.add(miE);
		mEdit.addSeparator();
		mEdit.add(miF);
		mEdit.add(miG);
		mEdit.add(miH);
		mEdit.add(miI);
		mEdit.addSeparator();
		mEdit.add(miZ);
		mEdit.add(miX);
		mEdit.add(miC);
		mEdit.add(miB);
		mEdit.add(miN);
		mEdit.add(miM);
		mEdit.addSeparator();
		mEdit.add(mi0);
		mEdit.add(miV);

		Menu mView = new Menu("서식(O)");
		Menu mHelp = new Menu("보기(V)");
		Menu mHelps = new Menu("도움말(H)");
		CheckboxMenuItem miStatusbar = new CheckboxMenuItem("자동 줄바꿈(W)");
		mView.add("자동 줄바꿈(W)");
		mView.add("글꼴(F)...");

		mb.add(mFile);
		mb.add(mEdit);
		mb.add(mView);
		mb.add(mHelp);
		mb.setHelpMenu(mHelps);

		f.setMenuBar(mb);
		f.setVisible(true);
	}
}
