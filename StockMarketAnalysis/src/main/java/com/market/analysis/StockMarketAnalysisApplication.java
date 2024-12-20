package com.market.analysis;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class StockMarketAnalysisApplication {

	public static void main(String[] args) {
		SpringApplication.run(StockMarketAnalysisApplication.class, args);
	}

}


/**
 * exchange --> (NSE, BSE, SENSEX ) -> id, name  : one to many with scripts
 * candle --> Open, High,Low, Close, scriptID, timestamp, vwap
 * script --> id, name(e. reliance), exchange ::>
 * products --> CASH, FUTURES, OPTIONS(CALL & PUT) ::> id, name
 * FII : CASH > 0 : BUY, else SELL, similarly futures & options
 * fii_info --> id, productID, value, timestamp
 * dii_info --> id, productID, value, timestamp
 * market_verdict --> id,timestamp, fii_sentiment_cash,fii_sentiment_future,fii_sentiment_call_optipns, fii_sentiment_put_optipns,
 *            dii_sentiment_cash,dii_sentiment_future,dii_sentiment_call_optipns, dii_sentiment_put_optipns, overall_sentiment(BULLISH, BEARISH, SIDEWAYS)
 * result_analytics -->  id, previous_verdict, intraday_move, result, timestamp
 *
 *
 *NSE :-> Reliance -> Candle
 * HW:
 * exchange --> many sectors
 * one sector --> many industries
 * one industry --> multiple script
 * exchange --> sector --> industry --> script  ::> HW
 *
 * Restaurant-Menu : M-M
 * Restaurant-Menu-Mapping: PK of resturent, PK of menu , PK
 * R1 - M1 - P1
 * R1 - M2 - P2
 * R2 - M1 - P3
 * select price from menu join Restaurant-Menu-Mapping on menu.id = Restaurant-Menu-Mapping.menu
 *
 * Collection vs Relation
 */