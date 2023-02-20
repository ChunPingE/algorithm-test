package baekjoon.sec03.baek15552;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		//평소 사용하던 인풋스트림을 파일대신 시스템값넣기
		InputStreamReader is = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(is);
		OutputStreamWriter os = new OutputStreamWriter(System.out); 
		BufferedWriter bw =   new BufferedWriter(os);
		System.out.println("입력");
		int N = Integer.parseInt(br.readLine());
		
		StringTokenizer st;
		
		for (int i = 0; i < N; i++) {
			System.out.println("입력2");
			st = new StringTokenizer(br.readLine()," ");
			bw.write((Integer.parseInt(st.nextToken()) + Integer.parseInt(st.nextToken()))+ "\n");
		}
		br.close();
        
		bw.flush();
		bw.close();
		
		/*
		모든 입력은 BufferedReader.readLine() 으로 받았다.
		테스트 케이스에서 주어지는 두 정수는 문자열 분리를 위해 매 반복마다 StringTokenizer 을 생성과 동시에 문자를 입력받는다.
		( st = new StringTokenizer(br.readLine(), " ");
		또한 다음 열에서 각 StringTokenizer 의 토큰 (분리되어있는 문자)을 반환하며,
		반환되는 타입은 String 이므로 Integer.parseInt를 통해 int형으로 바꾸어 준다. 
		이렇게 바꾼 두 토큰을 더해준 값을 BufferedWriter.write() 에 넣어준다
		( bw.write((Integer.parseInt(st.nextToken())+Integer.parseInt(st.nextToken()))+ "\n"); )

		그리고 거의 필수적으로 버퍼를 비운 뒤(flush) 닫아줘야한다(close).

		*/
		}
	}
		




