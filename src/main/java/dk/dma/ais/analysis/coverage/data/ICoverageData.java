package dk.dma.ais.analysis.coverage.data;

import java.util.Collection;
import java.util.Date;
import java.util.List;
import java.util.Map;

import dk.dma.ais.analysis.coverage.data.Ship.ShipClass;



public interface ICoverageData {
	
	Ship createShip(String sourceMmsi, long shipMmsi, ShipClass shipClass);
	Ship getShip(String sourceMmsi, long shipMmsi);
	void updateShip(Ship ship);
	
	Cell createCell(String sourceMmsi, double lat, double lon);
	Cell getCell(String sourceMmsi, double lat, double lon);
	void updateCell(Cell c);
	
	List<Cell> getCells(QueryParams params);
//	List<Cell> getCells();
//	List<Cell> getCells(Map<String, Boolean> sources);
//	List<Cell> getCells(double latStart, double lonStart, double latEnd, double lonEnd, Map<String, Boolean> sources, int multiplicationFactor);
	
	
	Source getSource(String sourceId);
	Source createSource(String sourceId);
	String[] getSourceNames();
	Collection<Source> getSources();
	
	void setLatSize(double latsize);
	void setLonSize(double lonsize);
//	double getLatSize();
//	double getLonSize();
	
	void incrementReceivedSignals(String sourceMmsi, double lat, double lon, Date timestamp);
	void incrementMissingSignals(String sourceMmsi, double lat, double lon, Date timestamp);
	

}