package edu.utap.stocksleuth.api.stockApi
const val ListOfStocks = """
{"StockData":[
{
   "Symbol": "AAPL",
   "Description": "Apple Inc"
 },
 {
   "Symbol": "MSFT",
   "Description": "Microsoft Corp"
 },
 {
   "Symbol": "AMZN",
   "Description": "Amazon.Com Inc."
 },
 {
   "Symbol": "GOOG",
   "Description": "Alphabet Inc Class C"
 },
 {
   "Symbol": "GOOGL",
   "Description": "Alphabet Inc Class A"
 },
 {
   "Symbol": "TSLA",
   "Description": "Tesla Inc"
 },
 {
   "Symbol": "BRK.B",
   "Description": "Berkshire Hathaway Inc. Class B"
 },
 {
   "Symbol": "UNH",
   "Description": "Unitedhealth Group Inc"
 },
 {
   "Symbol": "JNJ",
   "Description": "Johnson & Johnson"
 },
 {
   "Symbol": "SPY",
   "Description": "S&P 500"
 },
 {
   "Symbol": "XOM",
   "Description": "Exxon Mobil Corp"
 },
 {
   "Symbol": "WMT",
   "Description": "Walmart Stores Inc"
 },
 {
   "Symbol": "JPM",
   "Description": "JP Morgan Chase & Co"
 },
 {
   "Symbol": "CVX",
   "Description": "Chevron Corp"
 },
 {
   "Symbol": "LLY",
   "Description": "Eli Lilly"
 },
 {
   "Symbol": "V",
   "Description": "Visa Inc Class A"
 },
 {
   "Symbol": "NVDA",
   "Description": "Nvidia Corp"
 },
 {
   "Symbol": "PG",
   "Description": "Procter & Gamble"
 },
 {
   "Symbol": "MA",
   "Description": "Mastercard Inc Class A"
 },
 {
   "Symbol": "HD",
   "Description": "Home Depot Inc"
 },
 {
   "Symbol": "BAC",
   "Description": "Bank of America Corp"
 },
 {
   "Symbol": "ABBV",
   "Description": "Abbvie Inc"
 },
 {
   "Symbol": "META",
   "Description": "Meta Platforms Inc."
 },
 {
   "Symbol": "KO",
   "Description": "Coca-Cola"
 },
 {
   "Symbol": "PFE",
   "Description": "Pfizer Inc"
 },
 {
   "Symbol": "MRK",
   "Description": "Merck & Co Inc"
 },
 {
   "Symbol": "PEP",
   "Description": "Pepsico Inc"
 },
 {
   "Symbol": "COST",
   "Description": "Costco Wholesale Corp"
 },
 {
   "Symbol": "ORCL",
   "Description": "Oracle Corp"
 },
 {
   "Symbol": "TMO",
   "Description": "Thermo Fisher Scientific Inc"
 },
 {
   "Symbol": "MCD",
   "Description": "Mcdonalds Corp"
 },
 {
   "Symbol": "DIS",
   "Description": "Walt Disney"
 },
 {
   "Symbol": "ACN",
   "Description": "Accenture Plc Class A"
 },
 {
   "Symbol": "AVGO",
   "Description": "Broadcom Inc."
 },
 {
   "Symbol": "CSCO",
   "Description": "Cisco Systems Inc"
 },
 {
   "Symbol": "DHR",
   "Description": "Danaher Corp"
 },
 {
   "Symbol": "TMUS",
   "Description": "T Mobile US Inc"
 },
 {
   "Symbol": "WFC",
   "Description": "Wells Fargo"
 },
 {
   "Symbol": "ABT",
   "Description": "Abbott Laboratories"
 },
 {
   "Symbol": "COP",
   "Description": "ConocoPhillips"
 },
 {
   "Symbol": "CRM",
   "Description": "Salesforce.Com Inc"
 },
 {
   "Symbol": "BMY",
   "Description": "Bristol Myers Squibb"
 },
 {
   "Symbol": "VZ",
   "Description": "Verizon Communications Inc"
 },
 {
   "Symbol": "NEE",
   "Description": "Nextera Energy Inc"
 },
 {
   "Symbol": "ADBE",
   "Description": "Adobe Inc"
 },
 {
   "Symbol": "LIN",
   "Description": "Linde Plc"
 },
 {
   "Symbol": "AMGN",
   "Description": "Amgen Inc"
 },
 {
   "Symbol": "TXN",
   "Description": "Texas Instrument Inc"
 },
 {
   "Symbol": "CMCSA",
   "Description": "Comcast A Corp"
 },
 {
   "Symbol": "SCHW",
   "Description": "Charles Schwab Corporation"
 },
 {
   "Symbol": "PM",
   "Description": "Philip Morris International Inc"
 },
 {
   "Symbol": "MS",
   "Description": "Morgan Stanley"
 },
 {
   "Symbol": "RTX",
   "Description": "Raytheon Technologies Corporation"
 },
 {
   "Symbol": "HON",
   "Description": "Honeywell International Inc"
 },
 {
   "Symbol": "NFLX",
   "Description": "Netflix Inc"
 },
 {
   "Symbol": "QCOM",
   "Description": "Qualcomm Inc"
 },
 {
   "Symbol": "T",
   "Description": "AT&T Inc."
 },
 {
   "Symbol": "ELV",
   "Description": "Elevance Health Inc."
 },
 {
   "Symbol": "LMT",
   "Description": "Lockheed Martin Corp"
 },
 {
   "Symbol": "IBM",
   "Description": "International Business Machines Co"
 },
 {
   "Symbol": "CVS",
   "Description": "CVS Health Corp"
 },
 {
   "Symbol": "UPS",
   "Description": "United Parcel Service Inc Class B"
 },
 {
   "Symbol": "UNP",
   "Description": "Union Pacific Corp"
 },
 {
   "Symbol": "LOW",
   "Description": "Lowes Companies Inc"
 },
 {
   "Symbol": "DE",
   "Description": "Deere & Company"
 },
 {
   "Symbol": "INTU",
   "Description": "Intuit Inc"
 },
 {
   "Symbol": "GS",
   "Description": "Goldman Sachs Group Inc"
 },
 {
   "Symbol": "NKE",
   "Description": "Nike Inc Class B"
 },
 {
   "Symbol": "MDT",
   "Description": "Medtronic Plc"
 },
 {
   "Symbol": "CAT",
   "Description": "Caterpillar Inc"
 },
 {
   "Symbol": "AXP",
   "Description": "American Express"
 },
 {
   "Symbol": "INTC",
   "Description": "Intel Corporation Corp"
 },
 {
   "Symbol": "SPGI",
   "Description": "S&P Global Inc"
 },
 {
   "Symbol": "PYPL",
   "Description": "Paypal Holdings Inc"
 },
 {
   "Symbol": "SBUX",
   "Description": "Starbucks Corp"
 },
 {
   "Symbol": "BLK",
   "Description": "Blackrock Inc"
 },
 {
   "Symbol": "ADP",
   "Description": "Automatic Data Processing Inc"
 },
 {
   "Symbol": "CI",
   "Description": "Cigna Corp"
 },
 {
   "Symbol": "AMD",
   "Description": "Advanced Micro Devices Inc"
 },
 {
   "Symbol": "AMT",
   "Description": "American Tower Corporation"
 },
 {
   "Symbol": "C",
   "Description": "Citigroup Inc"
 },
 {
   "Symbol": "GILD",
   "Description": "Gilead Sciences Inc"
 },
 {
   "Symbol": "CB",
   "Description": "Chubb Ltd"
 },
 {
   "Symbol": "SYK",
   "Description": "Stryker Corp"
 },
 {
   "Symbol": "ISRG",
   "Description": "Intuitive Surgical Inc"
 },
 {
   "Symbol": "NOW",
   "Description": "Servicenow Inc"
 },
 {
   "Symbol": "TJX",
   "Description": "TJX Companies Inc."
 },
 {
   "Symbol": "GE",
   "Description": "General Electric"
 },
 {
   "Symbol": "BA",
   "Description": "Boeing"
 },
 {
   "Symbol": "NOC",
   "Description": "Northrop Grumman Corp"
 },
 {
   "Symbol": "MDLZ",
   "Description": "Mondelez International Inc"
 },
 {
   "Symbol": "PLD",
   "Description": "Prologis Inc"
 },
 {
   "Symbol": "MO",
   "Description": "Altria Group Inc"
 },
 {
   "Symbol": "EOG",
   "Description": "EOG Resources Inc"
 },
 {
   "Symbol": "REGN",
   "Description": "Regeneron Pharmaceuticals Inc"
 },
 {
   "Symbol": "MMC",
   "Description": "Marsh & McLennan Inc"
 },
 {
   "Symbol": "TGT",
   "Description": "Target Corp"
 },
 {
   "Symbol": "AMAT",
   "Description": "Applied Material Inc"
 },
 {
   "Symbol": "VRTX",
   "Description": "Vertex Pharmaceuticals Inc"
 },
 {
   "Symbol": "SLB",
   "Description": "Schlumberger Nv"
 },
 {
   "Symbol": "BKNG",
   "Description": "Booking Holdings Inc"
 },
 {
   "Symbol": "PGR",
   "Description": "Progressive Corp"
 },
 {
   "Symbol": "ADI",
   "Description": "Analog Devices Inc"
 },
 {
   "Symbol": "ZTS",
   "Description": "Zoetis Inc"
 },
 {
   "Symbol": "DUK",
   "Description": "Duke Energy Corp"
 },
 {
   "Symbol": "SO",
   "Description": "Southern Co"
 },
 {
   "Symbol": "HUM",
   "Description": "Humana Inc"
 },
 {
   "Symbol": "GD",
   "Description": "General Dynamics Corp"
 },
 {
   "Symbol": "MMM",
   "Description": "3M"
 },
 {
   "Symbol": "OXY",
   "Description": "Occidental Petroleum Corp"
 },
 {
   "Symbol": "PNC",
   "Description": "PNC Financial Services Group Inc."
 },
 {
   "Symbol": "BDX",
   "Description": "Becton Dickinson"
 },
 {
   "Symbol": "WM",
   "Description": "Waste Management Inc"
 },
 {
   "Symbol": "BX",
   "Description": "Blackstone Group Inc. Class A"
 },
 {
   "Symbol": "PXD",
   "Description": "Pioneer Natural Resource"
 },
 {
   "Symbol": "ITW",
   "Description": "Illinois Tool Inc"
 },
 {
   "Symbol": "FISV",
   "Description": "Fiserv Inc"
 },
 {
   "Symbol": "USB",
   "Description": "US Bancorp"
 },
 {
   "Symbol": "HCA",
   "Description": "HCA Healthcare Inc."
 },
 {
   "Symbol": "CME",
   "Description": "CME Group Inc Class A"
 },
 {
   "Symbol": "CL",
   "Description": "Colgate-Palmolive"
 },
 {
   "Symbol": "CSX",
   "Description": "CSX Corp"
 },
 {
   "Symbol": "AON",
   "Description": "Aon Plc"
 },
 {
   "Symbol": "BSX",
   "Description": "Boston Scientific Corp"
 },
 {
   "Symbol": "TFC",
   "Description": "Truist Financial Corporation"
 },
 {
   "Symbol": "ETN",
   "Description": "Eaton Corporation PLC"
 },
 {
   "Symbol": "MET",
   "Description": "Metlife Inc"
 },
 {
   "Symbol": "SHW",
   "Description": "Sherwin Williams"
 },
 {
   "Symbol": "MRNA",
   "Description": "Moderna Inc."
 },
 {
   "Symbol": "DG",
   "Description": "Dollar General Corp"
 },
 {
   "Symbol": "CHTR",
   "Description": "Charter Communications Inc Class A"
 },
 {
   "Symbol": "MU",
   "Description": "Micron Technology Inc"
 },
 {
   "Symbol": "ATVI",
   "Description": "Activision Blizzard Inc"
 },
 {
   "Symbol": "MPC",
   "Description": "Marathon Petroleum Corp"
 },
 {
   "Symbol": "D",
   "Description": "Dominion Energy Inc"
 },
 {
   "Symbol": "MCK",
   "Description": "Mckesson Corp"
 },
 {
   "Symbol": "CCI",
   "Description": "Crown Castle International Corp."
 },
 {
   "Symbol": "APD",
   "Description": "Air Products And Chemicals Inc"
 },
 {
   "Symbol": "GM",
   "Description": "General Motors"
 },
 {
   "Symbol": "SNOW",
   "Description": "Snowflake Inc. Class A"
 },
 {
   "Symbol": "KDP",
   "Description": "Keurig Dr Pepper Inc."
 },
 {
   "Symbol": "EW",
   "Description": "Edwards Lifesciences Corp"
 },
 {
   "Symbol": "ICE",
   "Description": "Intercontinental Exchange Inc"
 },
 {
   "Symbol": "LRCX",
   "Description": "Lam Research Corp"
 },
 {
   "Symbol": "PSA",
   "Description": "Public Storage"
 },
 {
   "Symbol": "UBER",
   "Description": "Uber Technologies Inc."
 },
 {
   "Symbol": "NSC",
   "Description": "Norfolk Southern Corp"
 },
 {
   "Symbol": "ADM",
   "Description": "Archer-Daniels-Midland Company"
 },
 {
   "Symbol": "ORLY",
   "Description": "Oreilly Automotive Inc"
 },
 {
   "Symbol": "F",
   "Description": "Ford Motor Company"
 },
 {
   "Symbol": "EMR",
   "Description": "Emerson Electric"
 },
 {
   "Symbol": "MAR",
   "Description": "Marriott International Inc"
 },
 {
   "Symbol": "EQIX",
   "Description": "Equinix Inc."
 },
 {
   "Symbol": "FIS",
   "Description": "Fidelity National Information Services"
 },
 {
   "Symbol": "DVN",
   "Description": "Devon Energy Corp"
 },
 {
   "Symbol": "PSX",
   "Description": "Phillips 66"
 },
 {
   "Symbol": "VLO",
   "Description": "Valero Energy Corp"
 },
 {
   "Symbol": "LHX",
   "Description": "L3Harris Technologies Inc."
 },
 {
   "Symbol": "MNST",
   "Description": "Monster Beverage Corp"
 },
 {
   "Symbol": "AZO",
   "Description": "Autozone Inc"
 },
 {
   "Symbol": "MCO",
   "Description": "Moodys Corp"
 },
 {
   "Symbol": "CTVA",
   "Description": "Corteva Inc."
 },
 {
   "Symbol": "CNC",
   "Description": "Centene Corp"
 },
 {
   "Symbol": "GIS",
   "Description": "General Mills Inc"
 },
 {
   "Symbol": "EL",
   "Description": "Estee Lauder Inc Class A"
 },
 {
   "Symbol": "SRE",
   "Description": "Sempra Energy"
 },
 {
   "Symbol": "VMW",
   "Description": "VMWare Inc Class A"
 },
 {
   "Symbol": "FCX",
   "Description": "Freeport-McMoRan Inc."
 },
 {
   "Symbol": "KHC",
   "Description": "Kraft Heinz"
 },
 {
   "Symbol": "ADSK",
   "Description": "Autodesk Inc"
 },
 {
   "Symbol": "STZ",
   "Description": "Constellation Brands Class A"
 },
 {
   "Symbol": "AEP",
   "Description": "American Electric Power Inc"
 },
 {
   "Symbol": "ABNB",
   "Description": "Airbnb Inc."
 },
 {
   "Symbol": "SNPS",
   "Description": "Synopsys Inc"
 },
 {
   "Symbol": "FTNT",
   "Description": "Fortinet Inc"
 },
 {
   "Symbol": "APH",
   "Description": "Amphenol Corp"
 },
 {
   "Symbol": "HES",
   "Description": "Hess Corp"
 },
 {
   "Symbol": "KLAC",
   "Description": "KLA-Tencor Corporation"
 },
 {
   "Symbol": "ECL",
   "Description": "Ecolab Inc"
 },
 {
   "Symbol": "LNG",
   "Description": "Cheniere Energy Inc"
 },
 {
   "Symbol": "RSG",
   "Description": "Republic Services Inc"
 },
 {
   "Symbol": "ROP",
   "Description": "Roper Technologies Inc"
 },
 {
   "Symbol": "SYY",
   "Description": "Sysco Corp"
 },
 {
   "Symbol": "CTAS",
   "Description": "Cintas Corp"
 },
 {
   "Symbol": "KKR",
   "Description": "KKR & Co Inc."
 },
 {
   "Symbol": "PAYX",
   "Description": "Paychex Inc"
 },
 {
   "Symbol": "TRV",
   "Description": "Travelers Companies Inc"
 },
 {
   "Symbol": "ENPH",
   "Description": "Enphase Energy Inc"
 },
 {
   "Symbol": "AIG",
   "Description": "American International Group Inc"
 },
 {
   "Symbol": "TWTR",
   "Description": "Twitter Inc"
 },
 {
   "Symbol": "KMB",
   "Description": "Kimberly Clark Corp"
 },
 {
   "Symbol": "FDX",
   "Description": "FedEx Corporation"
 },
 {
   "Symbol": "CDNS",
   "Description": "Cadence Design Systems Inc"
 },
 {
   "Symbol": "CMG",
   "Description": "Chipotle Mexican Grill Inc"
 },
 {
   "Symbol": "MSI",
   "Description": "Motorola Solutions Inc"
 },
 {
   "Symbol": "A",
   "Description": "Agilent Technologies Inc"
 },
 {
   "Symbol": "BIIB",
   "Description": "Biogen Inc"
 },
 {
   "Symbol": "KMI",
   "Description": "Kinder Morgan Inc"
 },
 {
   "Symbol": "DXCM",
   "Description": "Dexcom Inc"
 },
 {
   "Symbol": "JCI",
   "Description": "Johnson Controls International Plc"
 },
 {
   "Symbol": "AFL",
   "Description": "Aflac Inc"
 },
 {
   "Symbol": "WMB",
   "Description": "Williams Inc"
 },
 {
   "Symbol": "LULU",
   "Description": "Lululemon Athletica Inc"
 },
 {
   "Symbol": "COF",
   "Description": "Capital One Financial Corp"
 },
 {
   "Symbol": "PCG",
   "Description": "Pacific Gas & Electric Co."
 },
 {
   "Symbol": "PRU",
   "Description": "Prudential Financial Inc"
 },
 {
   "Symbol": "IQV",
   "Description": "IQVIA Holdings Inc."
 },
 {
   "Symbol": "SCCO",
   "Description": "Southern Copper Corp"
 },
 {
   "Symbol": "AJG",
   "Description": "Arthur J Gallagher"
 },
 {
   "Symbol": "ILMN",
   "Description": "Illumina Inc"
 },
 {
   "Symbol": "EXC",
   "Description": "Exelon Corp"
 },
 {
   "Symbol": "O",
   "Description": "Realty Income Corporation"
 },
 {
   "Symbol": "PH",
   "Description": "Parker-Hannifin Corp"
 },
 {
   "Symbol": "MSCI",
   "Description": "MSCI Inc"
 },
 {
   "Symbol": "ANET",
   "Description": "Arista Networks Inc"
 },
 {
   "Symbol": "TT",
   "Description": "Trane Technologies plc"
 },
 {
   "Symbol": "HLT",
   "Description": "Hilton Worldwide Holdings Inc"
 },
 {
   "Symbol": "EA",
   "Description": "Electronic Arts Inc"
 },
 {
   "Symbol": "NUE",
   "Description": "Nucor Corp"
 },
 {
   "Symbol": "CRWD",
   "Description": "CrowdStrike Holdings Inc. - Class A"
 },
 {
   "Symbol": "DLTR",
   "Description": "Dollar Tree Inc"
 },
 {
   "Symbol": "SPG",
   "Description": "Simon Property Group Inc"
 },
 {
   "Symbol": "XEL",
   "Description": "Xcel Energy Inc"
 },
 {
   "Symbol": "HSY",
   "Description": "Hershey Foods"
 },
 {
   "Symbol": "NEM",
   "Description": "Newmont Corporation"
 },
 {
   "Symbol": "MRVL",
   "Description": "Marvell Technology Group Ltd"
 },
 {
   "Symbol": "RMD",
   "Description": "Resmed Inc"
 },
 {
   "Symbol": "MCHP",
   "Description": "Microchip Technology Inc"
 },
 {
   "Symbol": "GPN",
   "Description": "Global Payments Inc"
 },
 {
   "Symbol": "CMI",
   "Description": "Cummins Inc"
 },
 {
   "Symbol": "BK",
   "Description": "Bank Of New York Mellon Corp"
 },
 {
   "Symbol": "DOW",
   "Description": "Dow Inc."
 },
 {
   "Symbol": "CSGP",
   "Description": "Costar Group Inc"
 },
 {
   "Symbol": "ALL",
   "Description": "Allstate Corp"
 },
 {
   "Symbol": "ALB",
   "Description": "Albemarle Corp"
 },
 {
   "Symbol": "HAL",
   "Description": "Halliburton"
 },
 {
   "Symbol": "ROST",
   "Description": "Ross Stores Inc"
 },
 {
   "Symbol": "PCAR",
   "Description": "Paccar Inc"
 },
 {
   "Symbol": "KR",
   "Description": "Kroger"
 },
 {
   "Symbol": "AMP",
   "Description": "Ameriprise Finance Inc"
 },
 {
   "Symbol": "YUM",
   "Description": "Yum Brands Inc"
 },
 {
   "Symbol": "ABC",
   "Description": "AmerisourceBergen Corp"
 },
 {
   "Symbol": "BF.B",
   "Description": "Brown Forman Inc Class B"
 },
 {
   "Symbol": "BF.A",
   "Description": "Brown Forman Inc Class A"
 },
 {
   "Symbol": "CTSH",
   "Description": "Cognizant Technology Solutions"
 },
 {
   "Symbol": "CARR",
   "Description": "Carrier Global Corporation"
 },
 {
   "Symbol": "RIVN",
   "Description": "Rivian Automotive Inc.  Class A"
 },
 {
   "Symbol": "SQ",
   "Description": "Square Inc Class A"
 },
 {
   "Symbol": "WDAY",
   "Description": "Workday Inc"
 },
 {
   "Symbol": "KEYS",
   "Description": "Keysight Technologies Inc"
 },
 {
   "Symbol": "WBA",
   "Description": "Walgreen Boots Alliance Inc"
 },
 {
   "Symbol": "ED",
   "Description": "Consolidated Edison Inc"
 },
 {
   "Symbol": "TDG",
   "Description": "Transdigm Group Inc"
 },
 {
   "Symbol": "CEG",
   "Description": "Constellation Energy Corporation"
 },
 {
   "Symbol": "WBD",
   "Description": "Warner Bros. Discovery Inc. - Series A"
 },
 {
   "Symbol": "MTB",
   "Description": "M&T Bank Corp"
 },
 {
   "Symbol": "VICI",
   "Description": "VICI Properties Inc"
 },
 {
   "Symbol": "NDAQ",
   "Description": "Nasdaq Inc"
 },
 {
   "Symbol": "IDXX",
   "Description": "Idexx Laboratories Inc"
 },
 {
   "Symbol": "GFS",
   "Description": "GlobalFoundries Inc"
 },
 {
   "Symbol": "ODFL",
   "Description": "Old Dominion Freight Line Inc"
 },
 {
   "Symbol": "OTIS",
   "Description": "Otis Worldwide Corporation"
 },
 {
   "Symbol": "DLR",
   "Description": "Digital Realty Trust Inc"
 },
 {
   "Symbol": "TEAM",
   "Description": "Atlassian Plc Class A"
 },
 {
   "Symbol": "AME",
   "Description": "Ametek Inc"
 },
 {
   "Symbol": "LSXMA",
   "Description": "Liberty Media Liberty Siriusxm Series A"
 },
 {
   "Symbol": "LSXMK",
   "Description": "Liberty Media Liberty Siriusxm Series C"
 },
 {
   "Symbol": "FWONK",
   "Description": "Liberty Media Formula One Corp Series C"
 },
 {
   "Symbol": "FWONA",
   "Description": "Liberty Media Formula One Corp Series A"
 },
 {
   "Symbol": "ROK",
   "Description": "Rockwell Automation Inc"
 },
 {
   "Symbol": "DD",
   "Description": "DuPont de Nemours Inc."
 },
 {
   "Symbol": "MTD",
   "Description": "Mettler Toledo Inc"
 },
 {
   "Symbol": "ON",
   "Description": "ON Semiconductor Corp"
 },
 {
   "Symbol": "DFS",
   "Description": "Discover Financial Services"
 },
 {
   "Symbol": "SBAC",
   "Description": "SBA Communications Corporation"
 },
 {
   "Symbol": "WEC",
   "Description": "WEC Energy Group Inc"
 },
 {
   "Symbol": "VRSK",
   "Description": "Verisk Analytics Inc"
 },
 {
   "Symbol": "PEG",
   "Description": "Public Service Enterprise Group Inc"
 },
 {
   "Symbol": "HPQ",
   "Description": "HP Inc"
 },
 {
   "Symbol": "GWW",
   "Description": "W.W. Grainger Inc"
 },
 {
   "Symbol": "WELL",
   "Description": "Welltower Inc"
 },
 {
   "Symbol": "BAX",
   "Description": "Baxter International Inc"
 },
 {
   "Symbol": "GLW",
   "Description": "Corning Inc"
 },
 {
   "Symbol": "BKR",
   "Description": "Baker Hughes Company Class A"
 },
 {
   "Symbol": "CPRT",
   "Description": "Copart Inc"
 },
 {
   "Symbol": "FAST",
   "Description": "Fastenal"
 },
 {
   "Symbol": "LYB",
   "Description": "Lyondellbasell Industries NV"
 },
 {
   "Symbol": "CLR",
   "Description": "Continental Resources Inc"
 },
 {
   "Symbol": "STT",
   "Description": "State Street Corp"
 },
 {
   "Symbol": "LVS",
   "Description": "Las Vegas Sands Corp"
 },
 {
   "Symbol": "FANG",
   "Description": "Diamondback Energy Inc"
 },
 {
   "Symbol": "PPG",
   "Description": "PPG Industries Inc"
 },
 {
   "Symbol": "DHI",
   "Description": "D R Horton Inc"
 },
 {
   "Symbol": "OKE",
   "Description": "Oneok Inc"
 },
 {
   "Symbol": "ES",
   "Description": "Eversource Energy"
 },
 {
   "Symbol": "AWK",
   "Description": "American Water Works Inc"
 },
 {
   "Symbol": "K",
   "Description": "Kellogg"
 },
 {
   "Symbol": "RBLX",
   "Description": "Roblox Corp"
 },
 {
   "Symbol": "HRL",
   "Description": "Hormel Foods Corp"
 },
 {
   "Symbol": "GPC",
   "Description": "Genuine Parts"
 },
 {
   "Symbol": "RJF",
   "Description": "Raymond James Inc"
 },
 {
   "Symbol": "IFF",
   "Description": "International Flavors & Fragrances"
 },
 {
   "Symbol": "FITB",
   "Description": "Fifth Third Bancorp"
 },
 {
   "Symbol": "SGEN",
   "Description": "Seattle Genetics Inc"
 },
 {
   "Symbol": "AVB",
   "Description": "AvalonBay Communities Inc"
 },
 {
   "Symbol": "TROW",
   "Description": "T Rowe Price Group Inc"
 },
 {
   "Symbol": "APTV",
   "Description": "Aptiv Plc"
 },
 {
   "Symbol": "CTRA",
   "Description": "Coterra Energy Inc."
 },
 {
   "Symbol": "VEEV",
   "Description": "Veeva Systems Inc Class A"
 },
 {
   "Symbol": "TSCO",
   "Description": "Tractor Supply"
 },
 {
   "Symbol": "DDOG",
   "Description": "Datadog Inc. - Class A"
 },
 {
   "Symbol": "SIRI",
   "Description": "Sirius Xm Holdings Inc"
 },
 {
   "Symbol": "TTD",
   "Description": "Trade Desk Inc Class A"
 },
 {
   "Symbol": "EQR",
   "Description": "Equity Residential"
 },
 {
   "Symbol": "ZBH",
   "Description": "Zimmer Biomet Holdings Inc"
 },
 {
   "Symbol": "WTW",
   "Description": "Willis Towers Watson Public Limited Company"
 },
 {
   "Symbol": "ARE",
   "Description": "Alexandria Real Estate Equities Inc"
 },
 {
   "Symbol": "ALNY",
   "Description": "Alnylam Pharmaceuticals Inc"
 },
 {
   "Symbol": "LCID",
   "Description": "Lucid Group Inc."
 },
 {
   "Symbol": "IT",
   "Description": "Gartner Inc"
 },
 {
   "Symbol": "EXR",
   "Description": "Extra Space Storage Inc"
 },
 {
   "Symbol": "WY",
   "Description": "Weyerhaeuser Company"
 },
 {
   "Symbol": "CDW",
   "Description": "CDW Corp"
 },
 {
   "Symbol": "HIG",
   "Description": "Hartford Financial Services Group"
 },
 {
   "Symbol": "LEN.B",
   "Description": "Lennar Corporation Class B"
 },
 {
   "Symbol": "LEN",
   "Description": "Lennar Corporation Class A"
 },
 {
   "Symbol": "CBRE",
   "Description": "CBRE Group Inc"
 },
 {
   "Symbol": "EIX",
   "Description": "Edison International"
 },
 {
   "Symbol": "FTV",
   "Description": "Fortive Corp"
 },
 {
   "Symbol": "ZS",
   "Description": "Zscaler Inc"
 },
 {
   "Symbol": "EBAY",
   "Description": "Ebay Inc"
 },
 {
   "Symbol": "DAL",
   "Description": "Delta Air Lines Inc"
 },
 {
   "Symbol": "MRO",
   "Description": "Marathon Oil Corp"
 },
 {
   "Symbol": "VMC",
   "Description": "Vulcan Materials"
 },
 {
   "Symbol": "HBAN",
   "Description": "Huntington Bancshares Inc"
 },
 {
   "Symbol": "ETR",
   "Description": "Entergy Corp"
 },
 {
   "Symbol": "CF",
   "Description": "CF Industries Holdings Inc"
 },
 {
   "Symbol": "FE",
   "Description": "Firstenergy Corp"
 },
 {
   "Symbol": "DTE",
   "Description": "DTE Energy"
 },
 {
   "Symbol": "LUV",
   "Description": "Southwest Airlines"
 },
 {
   "Symbol": "FRC",
   "Description": "First Republic Bank"
 },
 {
   "Symbol": "MKC",
   "Description": "McCormick & Co  Non-voting"
 },
 {
   "Symbol": "AEE",
   "Description": "Ameren Corp"
 },
 {
   "Symbol": "ZM",
   "Description": "Zoom Video Communications Inc. - Class A"
 },
 {
   "Symbol": "URI",
   "Description": "United Rentals Inc"
 },
 {
   "Symbol": "MLM",
   "Description": "Martin Marietta Materials Inc"
 },
 {
   "Symbol": "ULTA",
   "Description": "Ulta Beauty Inc"
 },
 {
   "Symbol": "TTWO",
   "Description": "Take Two Interactive Software Inc"
 },
 {
   "Symbol": "MOH",
   "Description": "Molina Healthcare Inc"
 },
 {
   "Symbol": "PFG",
   "Description": "Principal Financial Group Inc"
 },
 {
   "Symbol": "EFX",
   "Description": "Equifax Inc"
 },
 {
   "Symbol": "UI",
   "Description": "Ubiquiti Inc."
 },
 {
   "Symbol": "ROL",
   "Description": "Rollins Inc"
 },
 {
   "Symbol": "RF",
   "Description": "Regions Financial Corp"
 },
 {
   "Symbol": "LPLA",
   "Description": "LPL Financial Holdings Inc"
 },
 {
   "Symbol": "PWR",
   "Description": "Quanta Services Inc"
 },
 {
   "Symbol": "LH",
   "Description": "Laboratory Corporation Of America"
 },
 {
   "Symbol": "PAYC",
   "Description": "Paycom Software Inc"
 },
 {
   "Symbol": "VRSN",
   "Description": "Verisign Inc"
 },
 {
   "Symbol": "CFG",
   "Description": "Citizens Financial Group Inc"
 },
 {
   "Symbol": "EPAM",
   "Description": "Epam Systems Inc"
 },
 {
   "Symbol": "CAH",
   "Description": "Cardinal Health Inc"
 },
 {
   "Symbol": "IR",
   "Description": "Ingersoll Rand Plc"
 },
 {
   "Symbol": "TSN",
   "Description": "Tyson Foods Inc Class A"
 },
 {
   "Symbol": "MOS",
   "Description": "Mosaic"
 },
 {
   "Symbol": "HEI",
   "Description": "Heico Corp"
 },
 {
   "Symbol": "HEI.A",
   "Description": "Heico Corporation Class A"
 },
 {
   "Symbol": "ACGL",
   "Description": "Arch Capital Group Ltd"
 },
 {
   "Symbol": "PPL",
   "Description": "PPL Corporation"
 },
 {
   "Symbol": "INVH",
   "Description": "Invitation Homes Inc"
 },
 {
   "Symbol": "WRB",
   "Description": "WR Berkley Corp"
 },
 {
   "Symbol": "ANSS",
   "Description": "Ansys Inc"
 },
 {
   "Symbol": "ZI",
   "Description": "ZoomInfo Technologies Inc. - Class A"
 },
 {
   "Symbol": "CHD",
   "Description": "Church And Dwight Inc"
 },
 {
   "Symbol": "RPRX",
   "Description": "Royalty Pharma plc - Class A"
 },
 {
   "Symbol": "XYL",
   "Description": "Xylem Inc"
 },
 {
   "Symbol": "HPE",
   "Description": "Hewlett Packard Enterprise"
 },
 {
   "Symbol": "WAT",
   "Description": "Waters Corp"
 },
 {
   "Symbol": "DOV",
   "Description": "Dover Corp"
 },
 {
   "Symbol": "LYV",
   "Description": "Live Nation Entertainment Inc"
 },
 {
   "Symbol": "TDY",
   "Description": "Teledyne Technologies Inc"
 },
 {
   "Symbol": "MAA",
   "Description": "Mid-America Apartment Communities Inc"
 },
 {
   "Symbol": "CLX",
   "Description": "Clorox"
 },
 {
   "Symbol": "CNP",
   "Description": "Centerpoint Energy Inc"
 },
 {
   "Symbol": "J",
   "Description": "Jacobs Engineering Group Inc."
 },
 {
   "Symbol": "NTRS",
   "Description": "Northern Trust Corporation"
 },
 {
   "Symbol": "JBHT",
   "Description": "JB Hunt Transport Services Inc"
 },
 {
   "Symbol": "DRI",
   "Description": "Darden Restaurants Inc"
 },
 {
   "Symbol": "AES",
   "Description": "AES Corp"
 },
 {
   "Symbol": "TPL",
   "Description": "Texas Pacific Land Trust"
 },
 {
   "Symbol": "AMCR",
   "Description": "Amcor plc"
 },
 {
   "Symbol": "CAG",
   "Description": "Conagra Brands Inc"
 },
 {
   "Symbol": "STE",
   "Description": "STERIS PLC"
 },
 {
   "Symbol": "STLD",
   "Description": "Steel Dynamics Inc"
 },
 {
   "Symbol": "PKI",
   "Description": "Perkinelmer Inc"
 },
 {
   "Symbol": "BR",
   "Description": "Broadridge Financial Solutions Inc"
 },
 {
   "Symbol": "PLTR",
   "Description": "Palantir Technologies Inc."
 },
 {
   "Symbol": "PODD",
   "Description": "Insulet Corp"
 },
 {
   "Symbol": "PANW",
   "Description": "Palo Alto Networks Inc"
 },
 {
   "Symbol": "WAB",
   "Description": "Westinghouse Air Brake Technologies"
 },
 {
   "Symbol": "KEY",
   "Description": "Keycorp"
 },
 {
   "Symbol": "HOLX",
   "Description": "Hologic Inc"
 },
 {
   "Symbol": "GRMN",
   "Description": "Garmin Ltd"
 },
 {
   "Symbol": "CMS",
   "Description": "CMS Energy Corp"
 },
 {
   "Symbol": "IEX",
   "Description": "IDEX Corp"
 },
 {
   "Symbol": "WST",
   "Description": "West Pharmaceutical Services Inc"
 },
 {
   "Symbol": "SUI",
   "Description": "Sun Communities Inc"
 },
 {
   "Symbol": "DGX",
   "Description": "Quest Diagnostics Inc"
 },
 {
   "Symbol": "INCY",
   "Description": "Incyte Corp"
 },
 {
   "Symbol": "EXPD",
   "Description": "Expeditors International Of Washington"
 },
 {
   "Symbol": "FDS",
   "Description": "Factset Research Systems Inc"
 },
 {
   "Symbol": "BRO",
   "Description": "Brown & Brown Inc"
 },
 {
   "Symbol": "BMRN",
   "Description": "Biomarin Pharmaceutical Inc"
 },
 {
   "Symbol": "SJM",
   "Description": "J.M. Smucker"
 },
 {
   "Symbol": "SYF",
   "Description": "Synchrony Financial"
 },
 {
   "Symbol": "MKL",
   "Description": "Markel Corp"
 },
 {
   "Symbol": "NET",
   "Description": "Cloudflare Inc. Class A"
 },
 {
   "Symbol": "CINF",
   "Description": "Cincinnati Financial Corp"
 },
 {
   "Symbol": "CPB",
   "Description": "Campbell Soup"
 },
 {
   "Symbol": "VTR",
   "Description": "Ventas Inc"
 },
 {
   "Symbol": "AGR",
   "Description": "Avangrid Inc"
 },
 {
   "Symbol": "MPWR",
   "Description": "Monolithic Power Systems Inc"
 },
 {
   "Symbol": "TRGP",
   "Description": "Targa Resources Corp"
 },
 {
   "Symbol": "AZPN",
   "Description": "Aspen Technology Inc"
 },
 {
   "Symbol": "LKQ",
   "Description": "LKQ Corp"
 },
 {
   "Symbol": "FOX",
   "Description": "Fox Corporation Class B"
 },
 {
   "Symbol": "FOXA",
   "Description": "Fox Corporation Class A"
 },
 {
   "Symbol": "BALL",
   "Description": "Ball Corporation"
 },
 {
   "Symbol": "FMC",
   "Description": "FMC Corp"
 },
 {
   "Symbol": "APA",
   "Description": "Apache Corp"
 },
 {
   "Symbol": "BBY",
   "Description": "Best Buy Inc"
 },
 {
   "Symbol": "DASH",
   "Description": "DoorDash Inc"
 },
 {
   "Symbol": "EXPE",
   "Description": "Expedia Inc"
 },
 {
   "Symbol": "NTAP",
   "Description": "NetApp Inc"
 },
 {
   "Symbol": "BG",
   "Description": "Bunge Ltd"
 },
 {
   "Symbol": "SPOT",
   "Description": "Spotify Technology SA"
 },
 {
   "Symbol": "ATO",
   "Description": "Atmos Energy Corp"
 },
 {
   "Symbol": "CSL",
   "Description": "Carlisle Companies Inc"
 },
 {
   "Symbol": "HWM",
   "Description": "Howmet Aerospace Inc."
 },
 {
   "Symbol": "HZNP",
   "Description": "Horizon Pharma Plc"
 },
 {
   "Symbol": "OMC",
   "Description": "Omnicom Group Inc"
 },
 {
   "Symbol": "IRM",
   "Description": "Iron Mountain Incorporated"
 },
 {
   "Symbol": "EQT",
   "Description": "EQT Corporation"
 },
 {
   "Symbol": "ESS",
   "Description": "Essex Property Trust Inc"
 },
 {
   "Symbol": "TRMB",
   "Description": "Trimble Inc"
 },
 {
   "Symbol": "WPC",
   "Description": "W. P. Carey Inc"
 },
 {
   "Symbol": "JKHY",
   "Description": "Jack Henry & Associates Inc."
 },
 {
   "Symbol": "ZBRA",
   "Description": "Zebra Technologies Corp"
 },
 {
   "Symbol": "BILL",
   "Description": "Bill.com Holdings Inc."
 },
 {
   "Symbol": "ALGN",
   "Description": "Align Technology Inc"
 },
 {
   "Symbol": "UAL",
   "Description": "United Continental Holdings Inc"
 },
 {
   "Symbol": "FSLR",
   "Description": "First Solar Inc"
 },
 {
   "Symbol": "TXT",
   "Description": "Textron Inc"
 },
 {
   "Symbol": "AKAM",
   "Description": "Akamai Technologies Inc"
 },
 {
   "Symbol": "TYL",
   "Description": "Tyler Technologies Inc"
 },
 {
   "Symbol": "AVTR",
   "Description": "Avantor Inc."
 },
 {
   "Symbol": "EVRG",
   "Description": "Evergy Inc"
 },
 {
   "Symbol": "FLT",
   "Description": "Fleetcor Technologies Inc"
 },
 {
   "Symbol": "BAH",
   "Description": "Booz Allen Hamilton Holding Corp"
 },
 {
   "Symbol": "AVY",
   "Description": "Avery Dennison Corp"
 },
 {
   "Symbol": "NVR",
   "Description": "NVR Inc."
 },
 {
   "Symbol": "L",
   "Description": "Loews Corp"
 },
 {
   "Symbol": "MGM",
   "Description": "MGM Resorts International"
 },
 {
   "Symbol": "SIVB",
   "Description": "SVB Financial Group"
 },
 {
   "Symbol": "LDOS",
   "Description": "Leidos Holdings Inc"
 },
 {
   "Symbol": "SPLK",
   "Description": "Splunk Inc"
 },
 {
   "Symbol": "HUBS",
   "Description": "Hubspot Inc"
 },
 {
   "Symbol": "SWKS",
   "Description": "Skyworks Solutions Inc"
 },
 {
   "Symbol": "PTC",
   "Description": "PTC Inc"
 },
 {
   "Symbol": "DINO",
   "Description": "HF Sinclair Corporation"
 },
 {
   "Symbol": "COO",
   "Description": "Cooper Companies Inc."
 },
 {
   "Symbol": "HST",
   "Description": "Host Hotels & Resorts Inc"
 },
 {
   "Symbol": "CBOE",
   "Description": "Cboe Global Markets Inc."
 },
 {
   "Symbol": "MDB",
   "Description": "MongoDB Inc. Class A"
 },
 {
   "Symbol": "FHN",
   "Description": "First Horizon National Corp"
 },
 {
   "Symbol": "TWLO",
   "Description": "Twilio Inc Class A"
 },
 {
   "Symbol": "HUBB",
   "Description": "Hubbell Inc"
 },
 {
   "Symbol": "RCL",
   "Description": "Royal Caribbean Cruises Ltd"
 },
 {
   "Symbol": "COIN",
   "Description": "Coinbase Class A"
 },
 {
   "Symbol": "KIM",
   "Description": "Kimco Realty Corporation"
 },
 {
   "Symbol": "OVV",
   "Description": "Ovintiv Inc."
 },
 {
   "Symbol": "ETSY",
   "Description": "Etsy Inc"
 },
 {
   "Symbol": "UDR",
   "Description": "UDR Inc"
 },
 {
   "Symbol": "PINS",
   "Description": "Pinterest Inc. Class A"
 },
 {
   "Symbol": "ARES",
   "Description": "Ares Management Corporation Class A"
 },
 {
   "Symbol": "RS",
   "Description": "Reliance Steel & Aluminum"
 },
 {
   "Symbol": "LNT",
   "Description": "Alliant Energy Corp"
 },
 {
   "Symbol": "NDSN",
   "Description": "Nordson Corp"
 },
 {
   "Symbol": "PCTY",
   "Description": "Paylocity Holding Corp"
 },
 {
   "Symbol": "WLK",
   "Description": "Westlake Chemical Corp"
 },
 {
   "Symbol": "SSNC",
   "Description": "SS&C Technologies Holdings Inc."
 },
 {
   "Symbol": "DAR",
   "Description": "Darling Ingredients Inc"
 },
 {
   "Symbol": "TER",
   "Description": "Teradyne Inc"
 },
 {
   "Symbol": "GDDY",
   "Description": "GoDaddy Inc. Class A"
 },
 {
   "Symbol": "RKT",
   "Description": "Rocket Companies Inc. Class A"
 },
 {
   "Symbol": "NLOK",
   "Description": "NortonLifeLock Inc."
 },
 {
   "Symbol": "PEAK",
   "Description": "Healthpeak Properties Inc."
 },
 {
   "Symbol": "LBRDA",
   "Description": "Liberty Broadband Corp Series A"
 },
 {
   "Symbol": "LBRDK",
   "Description": "Liberty Broadband Corp Series C"
 },
 {
   "Symbol": "MTCH",
   "Description": "Match Group Inc"
 },
 {
   "Symbol": "CPT",
   "Description": "Camden Property Trust"
 },
 {
   "Symbol": "GLPI",
   "Description": "Gaming and Leisure Properties Inc"
 },
 {
   "Symbol": "ABMD",
   "Description": "Abiomed Inc"
 },
 {
   "Symbol": "LW",
   "Description": "Lamb Weston Holdings Inc"
 },
 {
   "Symbol": "PARAA",
   "Description": "Paramount Global - Class A"
 },
 {
   "Symbol": "PARA",
   "Description": "Paramount Global - Class B"
 },
 {
   "Symbol": "POOL",
   "Description": "Pool Corp"
 },
 {
   "Symbol": "CHRW",
   "Description": "C.H. Robinson Worldwide Inc."
 },
 {
   "Symbol": "RPM",
   "Description": "RPM International Inc"
 },
 {
   "Symbol": "FICO",
   "Description": "Fair Isaac Corp"
 },
 {
   "Symbol": "VTRS",
   "Description": "Viatris Inc."
 },
 {
   "Symbol": "IP",
   "Description": "International Paper"
 },
 {
   "Symbol": "CTLT",
   "Description": "Catalent Inc"
 },
 {
   "Symbol": "RE",
   "Description": "Everest Re Group Ltd"
 },
 {
   "Symbol": "FCNCA",
   "Description": "First Citizens Bancshares Inc Class A"
 },
 {
   "Symbol": "CHK",
   "Description": "Chesapeake Energy Corporation"
 },
 {
   "Symbol": "ENTG",
   "Description": "Entegris Inc"
 },
 {
   "Symbol": "DPZ",
   "Description": "Dominos Pizza Inc"
 },
 {
   "Symbol": "BEN",
   "Description": "Franklin Resources Inc"
 },
 {
   "Symbol": "TECH",
   "Description": "Bio-Techne Corp"
 },
 {
   "Symbol": "CAR",
   "Description": "Avis Budget Group Inc"
 },
 {
   "Symbol": "AFG",
   "Description": "American Financial Group Inc"
 },
 {
   "Symbol": "IPG",
   "Description": "Interpublic Group Of Companies Inc"
 },
 {
   "Symbol": "BIO",
   "Description": "Bio Rad Laboratories Inc Class A"
 },
 {
   "Symbol": "SNA",
   "Description": "Snap On Inc"
 },
 {
   "Symbol": "WTRG",
   "Description": "Essential Utilities Inc."
 },
 {
   "Symbol": "ELS",
   "Description": "Equity LifeStyle Properties Inc"
 },
 {
   "Symbol": "NFE",
   "Description": "New Fortress Energy LLC - Class A"
 },
 {
   "Symbol": "AAP",
   "Description": "Advance Auto Parts Inc"
 },
 {
   "Symbol": "GGG",
   "Description": "Graco Inc"
 },
 {
   "Symbol": "EQH",
   "Description": "AXA Equitable Holdings Inc"
 },
 {
   "Symbol": "UHAL",
   "Description": "Amerco"
 },
 {
   "Symbol": "SWK",
   "Description": "Stanley Black & Decker Inc"
 },
 {
   "Symbol": "PKG",
   "Description": "Packaging Corp Of America"
 },
 {
   "Symbol": "CNA",
   "Description": "CNA Financial Corp"
 },
 {
   "Symbol": "BXP",
   "Description": "Boston Properties Inc"
 },
 {
   "Symbol": "TRU",
   "Description": "TransUnion"
 },
 {
   "Symbol": "DOX",
   "Description": "Amdocs Ltd"
 },
 {
   "Symbol": "RYAN",
   "Description": "Ryan Specialty Group Holdings Inc."
 },
 {
   "Symbol": "ERIE",
   "Description": "Erie Indemnity Class A"
 },
 {
   "Symbol": "AMH",
   "Description": "American Homes 4 Rent Class A"
 },
 {
   "Symbol": "WDC",
   "Description": "Western Digital Corp"
 },
 {
   "Symbol": "GL",
   "Description": "Globe Life Inc."
 },
 {
   "Symbol": "NBIX",
   "Description": "Neurocrine Biosciences Inc"
 },
 {
   "Symbol": "TTC",
   "Description": "Toro"
 },
 {
   "Symbol": "ACI",
   "Description": "Albertsons Companies Inc. Class A"
 },
 {
   "Symbol": "WOLF",
   "Description": "Wolfspeed Inc."
 },
 {
   "Symbol": "FNF",
   "Description": "Fidelity National Financial Inc"
 },
 {
   "Symbol": "AR",
   "Description": "Antero Resources Corp"
 },
 {
   "Symbol": "VFC",
   "Description": "VF Corp"
 },
 {
   "Symbol": "CRL",
   "Description": "Charles River Laboratories International"
 },
 {
   "Symbol": "WMS",
   "Description": "Advanced Drainage Systems Inc"
 },
 {
   "Symbol": "MAS",
   "Description": "Masco Corp"
 },
 {
   "Symbol": "BJ",
   "Description": "BJs Wholesale Club Holdings Inc"
 },
 {
   "Symbol": "ACM",
   "Description": "AECOM"
 },
 {
   "Symbol": "CE",
   "Description": "Celanese Corporation"
 },
 {
   "Symbol": "UTHR",
   "Description": "United Therapeutics Corp"
 },
 {
   "Symbol": "NRG",
   "Description": "NRG Energy Inc"
 },
 {
   "Symbol": "CG",
   "Description": "Carlyle Group"
 },
 {
   "Symbol": "NI",
   "Description": "Nisource Inc"
 },
 {
   "Symbol": "TAP",
   "Description": "Molson Coors Brewing Class B"
 },
 {
   "Symbol": "DT",
   "Description": "Dynatrace Inc."
 },
 {
   "Symbol": "HII",
   "Description": "Huntington Ingalls Industries Inc"
 },
 {
   "Symbol": "WSO",
   "Description": "Watsco Inc"
 },
 {
   "Symbol": "REG",
   "Description": "Regency Centers Corporation"
 },
 {
   "Symbol": "RGEN",
   "Description": "Repligen Corp"
 },
 {
   "Symbol": "REXR",
   "Description": "Rexford Industrial Realty Inc"
 },
 {
   "Symbol": "AXON",
   "Description": "Axon Enterprise Inc."
 },
 {
   "Symbol": "TFX",
   "Description": "Teleflex Inc"
 },
 {
   "Symbol": "QGEN",
   "Description": "Qiagen Nv"
 },
 {
   "Symbol": "EWBC",
   "Description": "East West Bancorp Inc"
 },
 {
   "Symbol": "KMX",
   "Description": "Carmax Inc"
 },
 {
   "Symbol": "CDAY",
   "Description": "Ceridian HCM Holding Inc."
 },
 {
   "Symbol": "SRPT",
   "Description": "Sarepta Therapeutics Inc"
 },
 {
   "Symbol": "DELL",
   "Description": "Dell Technologies Inc. Class C"
 },
 {
   "Symbol": "JNPR",
   "Description": "Juniper Networks Inc"
 },
 {
   "Symbol": "NWS",
   "Description": "News Corp Class B"
 },
 {
   "Symbol": "NWSA",
   "Description": "News Corp Class A"
 },
 {
   "Symbol": "RGA",
   "Description": "Reinsurance Group Of America Inc"
 },
 {
   "Symbol": "BSY",
   "Description": "Bentley Systems Inc Class B"
 },
 {
   "Symbol": "DOCU",
   "Description": "Docusign Inc."
 },
 {
   "Symbol": "CCL",
   "Description": "Carnival Corp"
 },
 {
   "Symbol": "MORN",
   "Description": "Morningstar Inc"
 },
 {
   "Symbol": "BKI",
   "Description": "Black Knight"
 },
 {
   "Symbol": "DECK",
   "Description": "Deckers Outdoor Corp"
 },
 {
   "Symbol": "HSIC",
   "Description": "Henry Schein Inc"
 },
 {
   "Symbol": "CFR",
   "Description": "Cullen Frost Bankers Inc"
 },
 {
   "Symbol": "BLDR",
   "Description": "Builders Firstsource Inc"
 },
 {
   "Symbol": "ZEN",
   "Description": "Zendesk Inc"
 },
 {
   "Symbol": "SCI",
   "Description": "Service Corporation International"
 },
 {
   "Symbol": "WBS",
   "Description": "Webster Financial Corp"
 },
 {
   "Symbol": "PLUG",
   "Description": "Plug Power Inc"
 },
 {
   "Symbol": "EMN",
   "Description": "Eastman Chemical"
 },
 {
   "Symbol": "BURL",
   "Description": "Burlington Stores Inc"
 },
 {
   "Symbol": "ARMK",
   "Description": "Aramark"
 },
 {
   "Symbol": "SBNY",
   "Description": "Signature Bank"
 },
 {
   "Symbol": "VST",
   "Description": "Vistra Energy Corp"
 },
 {
   "Symbol": "BRKR",
   "Description": "Bruker Corp"
 },
 {
   "Symbol": "CMA",
   "Description": "Comerica Inc"
 },
 {
   "Symbol": "ALLE",
   "Description": "Allegion PLC"
 },
 {
   "Symbol": "AAL",
   "Description": "American Airlines Group Inc"
 },
 {
   "Symbol": "AGCO",
   "Description": "AGCO Corp"
 },
 {
   "Symbol": "WSC",
   "Description": "Willscot Corp"
 },
 {
   "Symbol": "HAS",
   "Description": "Hasbro Inc"
 },
 {
   "Symbol": "UNM",
   "Description": "Unum Group"
 },
 {
   "Symbol": "MKTX",
   "Description": "Marketaxess Holdings Inc"
 },
 {
   "Symbol": "LSI",
   "Description": "Life Storage Inc"
 },
 {
   "Symbol": "STOR",
   "Description": "STORE Capital Corporation"
 },
 {
   "Symbol": "PHM",
   "Description": "Pultegroup Inc"
 },
 {
   "Symbol": "LNC",
   "Description": "Lincoln National Corp"
 },
 {
   "Symbol": "PSTG",
   "Description": "Pure Storage Inc Class A"
 },
 {
   "Symbol": "CZR",
   "Description": "Caesars Entertainment Corp"
 },
 {
   "Symbol": "NOV",
   "Description": "National Oilwell Varco Inc"
 },
 {
   "Symbol": "CUBE",
   "Description": "CubeSmart"
 },
 {
   "Symbol": "DVA",
   "Description": "Davita Inc"
 },
 {
   "Symbol": "RRX",
   "Description": "Regal Rexnord Corporation"
 },
 {
   "Symbol": "JAZZ",
   "Description": "Jazz Pharmaceuticals Plc"
 },
 {
   "Symbol": "QRVO",
   "Description": "Qorvo Inc."
 },
 {
   "Symbol": "G",
   "Description": "Genpact Ltd"
 },
 {
   "Symbol": "BWA",
   "Description": "BorgWarner Inc"
 },
 {
   "Symbol": "JBL",
   "Description": "Jabil Inc"
 },
 {
   "Symbol": "MTN",
   "Description": "Vail Resorts Inc"
 },
 {
   "Symbol": "SNX",
   "Description": "Synnex Corp"
 },
 {
   "Symbol": "WRK",
   "Description": "Westrock"
 },
 {
   "Symbol": "OKTA",
   "Description": "Okta Inc Class A"
 },
 {
   "Symbol": "CASY",
   "Description": "Caseys General Stores Inc"
 },
 {
   "Symbol": "HOOD",
   "Description": "Robinhood Markets Inc."
 },
 {
   "Symbol": "ALLY",
   "Description": "Ally Financial Inc"
 },
 {
   "Symbol": "U",
   "Description": "Unity Software Inc."
 },
 {
   "Symbol": "FFIV",
   "Description": "F5 Networks Inc"
 },
 {
   "Symbol": "CCK",
   "Description": "Crown Holdings Inc"
 },
 {
   "Symbol": "CBSH",
   "Description": "Commerce Bancshares Inc"
 },
 {
   "Symbol": "AGL",
   "Description": "agilon health inc."
 },
 {
   "Symbol": "IBKR",
   "Description": "Interactive Brokers Group Inc"
 },
 {
   "Symbol": "RHI",
   "Description": "Robert Half"
 },
 {
   "Symbol": "WSM",
   "Description": "Williams Sonoma Inc"
 },
 {
   "Symbol": "FIVE",
   "Description": "Five Below Inc"
 },
 {
   "Symbol": "LECO",
   "Description": "Lincoln Electric Holdings Inc"
 },
 {
   "Symbol": "LEA",
   "Description": "Lear Corp"
 },
 {
   "Symbol": "LII",
   "Description": "Lennox International Inc"
 },
 {
   "Symbol": "LAMR",
   "Description": "Lamar Advertising Company Class A"
 },
 {
   "Symbol": "PAG",
   "Description": "Penske Automotive Group Inc"
 },
 {
   "Symbol": "CGNX",
   "Description": "Cognex Corp"
 },
 {
   "Symbol": "GME",
   "Description": "Gamestop Corp Class A"
 },
 {
   "Symbol": "JEF",
   "Description": "Jefferies Financial Group Inc"
 },
 {
   "Symbol": "PFGC",
   "Description": "Performance Food Group"
 },
 {
   "Symbol": "FRT",
   "Description": "Federal Realty Investment Trust"
 },
 {
   "Symbol": "JLL",
   "Description": "Jones Lang LaSalle Inc"
 },
 {
   "Symbol": "GLOB",
   "Description": "Globant Sa"
 },
 {
   "Symbol": "NLY",
   "Description": "Annaly Capital Management Inc"
 },
 {
   "Symbol": "OC",
   "Description": "Owens Corning"
 },
 {
   "Symbol": "TPR",
   "Description": "Tapestry"
 },
 {
   "Symbol": "HR",
   "Description": "Healthcare Realty Trust Incorporated"
 },
 {
   "Symbol": "FBHS",
   "Description": "Fortune Brands Home And Security"
 },
 {
   "Symbol": "GNRC",
   "Description": "Generac Holdings Inc"
 },
 {
   "Symbol": "BBWI",
   "Description": "Bath & Body Works Inc."
 },
 {
   "Symbol": "FND",
   "Description": "Floor Decor Holdings Inc"
 },
 {
   "Symbol": "OLN",
   "Description": "Olin Corp"
 },
 {
   "Symbol": "KNX",
   "Description": "Knight Transportation Inc"
 },
 {
   "Symbol": "ZION",
   "Description": "Zions Bancorporation"
 },
 {
   "Symbol": "PNW",
   "Description": "Pinnacle West Corp"
 },
 {
   "Symbol": "ACHC",
   "Description": "Acadia Healthcare Company Inc"
 },
 {
   "Symbol": "OHI",
   "Description": "Omega Healthcare Investors Inc"
 },
 {
   "Symbol": "ADT",
   "Description": "ADT Inc."
 },
 {
   "Symbol": "MANH",
   "Description": "Manhattan Associates Inc"
 },
 {
   "Symbol": "AA",
   "Description": "Alcoa Corp"
 },
 {
   "Symbol": "CHDN",
   "Description": "Churchill Downs Inc"
 },
 {
   "Symbol": "UHS",
   "Description": "Universal Health Services Inc."
 },
 {
   "Symbol": "MIDD",
   "Description": "Middleby Corp"
 },
 {
   "Symbol": "Z",
   "Description": "Zillow Group Inc Class C"
 },
 {
   "Symbol": "ZG",
   "Description": "Zillow Group Inc Class A"
 },
 {
   "Symbol": "WHR",
   "Description": "Whirlpool Corp"
 },
 {
   "Symbol": "SWN",
   "Description": "Southwestern Energy"
 },
 {
   "Symbol": "PCOR",
   "Description": "Procore Technologies Inc."
 },
 {
   "Symbol": "TTEK",
   "Description": "Tetra Tech Inc"
 },
 {
   "Symbol": "NNN",
   "Description": "National Retail Properties Inc"
 },
 {
   "Symbol": "UGI",
   "Description": "UGI Corp"
 },
 {
   "Symbol": "LUMN",
   "Description": "CenturyLink Inc."
 },
 {
   "Symbol": "OGE",
   "Description": "OGE Energy Corp"
 },
 {
   "Symbol": "CLF",
   "Description": "Cleveland-Cliffs Inc."
 },
 {
   "Symbol": "SEIC",
   "Description": "SEI Investments"
 },
 {
   "Symbol": "BOKF",
   "Description": "BOK Financial Corp"
 },
 {
   "Symbol": "ORI",
   "Description": "Old Republic International Corp"
 },
 {
   "Symbol": "NVCR",
   "Description": "Novocure Ltd"
 },
 {
   "Symbol": "GPK",
   "Description": "Graphic Packaging Holding"
 },
 {
   "Symbol": "WAL",
   "Description": "Western Alliance"
 },
 {
   "Symbol": "CHH",
   "Description": "Choice Hotels International Inc"
 },
 {
   "Symbol": "AIZ",
   "Description": "Assurant Inc"
 },
 {
   "Symbol": "WEX",
   "Description": "Wex Inc"
 },
 {
   "Symbol": "MPW",
   "Description": "Medical Properties Trust Inc"
 },
 {
   "Symbol": "CIEN",
   "Description": "Ciena Corp"
 },
 {
   "Symbol": "MASI",
   "Description": "Masimo Corp"
 },
 {
   "Symbol": "NXST",
   "Description": "Nexstar Media Group Inc"
 },
 {
   "Symbol": "CACI",
   "Description": "CACI International Inc"
 },
 {
   "Symbol": "IVZ",
   "Description": "Invesco Ltd"
 },
 {
   "Symbol": "CLVT",
   "Description": "Clarivate Plc"
 },
 {
   "Symbol": "PDCE",
   "Description": "PDC Energy Inc"
 },
 {
   "Symbol": "LSCC",
   "Description": "Lattice Semiconductor Corp"
 },
 {
   "Symbol": "DCI",
   "Description": "Donaldson Inc"
 },
 {
   "Symbol": "CHE",
   "Description": "Chemed Corp"
 },
 {
   "Symbol": "SEE",
   "Description": "Sealed Air Corp"
 },
 {
   "Symbol": "WCC",
   "Description": "Wesco International Inc"
 },
 {
   "Symbol": "PNR",
   "Description": "Pentair"
 },
 {
   "Symbol": "MP",
   "Description": "MP Materials Corp."
 },
 {
   "Symbol": "VOYA",
   "Description": "Voya Financial Inc"
 },
 {
   "Symbol": "PATH",
   "Description": "UiPath Inc."
 },
 {
   "Symbol": "HTZ",
   "Description": "Hertz Global Holdings Inc"
 },
 {
   "Symbol": "NCLH",
   "Description": "Norwegian Cruise Line Holdings Ltd"
 },
 {
   "Symbol": "EGP",
   "Description": "EastGroup Properties Inc"
 },
 {
   "Symbol": "VMI",
   "Description": "Valmont Inds Inc"
 },
 {
   "Symbol": "RRC",
   "Description": "Range Resources Corp"
 },
 {
   "Symbol": "AOS",
   "Description": "A O Smith Corp"
 },
 {
   "Symbol": "GMED",
   "Description": "Globus Medical Inc Class A"
 },
 {
   "Symbol": "OGN",
   "Description": "Organon & Co."
 },
 {
   "Symbol": "DXC",
   "Description": "DXC Technology Company"
 },
 {
   "Symbol": "WH",
   "Description": "Wyndham Hotels & Resorts Inc"
 },
 {
   "Symbol": "MAT",
   "Description": "Mattel Inc"
 },
 {
   "Symbol": "XRAY",
   "Description": "Dentsply Sirona Inc"
 },
 {
   "Symbol": "DKNG",
   "Description": "DraftKings Inc. - Class A"
 },
 {
   "Symbol": "USFD",
   "Description": "US Foods Holding Corp"
 },
 {
   "Symbol": "HRB",
   "Description": "H&R Block Inc"
 },
 {
   "Symbol": "CPRI",
   "Description": "Capri Holdings Limited"
 },
 {
   "Symbol": "PEN",
   "Description": "Penumbra Inc"
 },
 {
   "Symbol": "RNR",
   "Description": "Renaissancere Holding Ltd"
 },
 {
   "Symbol": "NWL",
   "Description": "Newell Brands Inc"
 },
 {
   "Symbol": "PB",
   "Description": "Prosperity Bancshares Inc"
 },
 {
   "Symbol": "ATR",
   "Description": "Aptargroup Inc"
 },
 {
   "Symbol": "CLH",
   "Description": "Clean Harbors Inc"
 },
 {
   "Symbol": "KBR",
   "Description": "KBR Inc."
 },
 {
   "Symbol": "COLD",
   "Description": "Americold Realty Trust"
 },
 {
   "Symbol": "ARW",
   "Description": "Arrow Electronics Inc"
 },
 {
   "Symbol": "RGLD",
   "Description": "Royal Gold Inc"
 },
 {
   "Symbol": "CW",
   "Description": "Curtiss Wright Corp"
 },
 {
   "Symbol": "WYNN",
   "Description": "Wynn Resorts Ltd"
 },
 {
   "Symbol": "ROKU",
   "Description": "Roku Class A"
 },
 {
   "Symbol": "DBX",
   "Description": "Dropbox Inc Class A"
 },
 {
   "Symbol": "REYN",
   "Description": "Reynolds Consumer Products Inc."
 },
 {
   "Symbol": "BERY",
   "Description": "Berry Global Group Inc"
 },
 {
   "Symbol": "STWD",
   "Description": "Starwood Property Trust Inc"
 },
 {
   "Symbol": "MHK",
   "Description": "Mohawk Industries Inc"
 },
 {
   "Symbol": "FR",
   "Description": "First Industrial Realty Trust Inc"
 },
 {
   "Symbol": "TOST",
   "Description": "Toast Inc."
 },
 {
   "Symbol": "SF",
   "Description": "Stifel Financial Corp"
 },
 {
   "Symbol": "BRX",
   "Description": "Brixmor Property Group Inc"
 },
 {
   "Symbol": "BYD",
   "Description": "Boyd Gaming Corp"
 },
 {
   "Symbol": "ESTC",
   "Description": "Elastic N.V."
 },
 {
   "Symbol": "CNXC",
   "Description": "Concentrix Corporation"
 },
 {
   "Symbol": "ELAN",
   "Description": "Elanco Animal Health Incorporated"
 },
 {
   "Symbol": "IONS",
   "Description": "Ionis Pharmaceuticals Inc"
 },
 {
   "Symbol": "DKS",
   "Description": "Dicks Sporting Inc"
 },
 {
   "Symbol": "SON",
   "Description": "Sonoco Products"
 },
 {
   "Symbol": "ST",
   "Description": "Sensata Technologies Holding Nv"
 },
 {
   "Symbol": "PNFP",
   "Description": "Pinnacle Financial Partners Inc"
 },
 {
   "Symbol": "ITT",
   "Description": "ITT Inc"
 },
 {
   "Symbol": "NTNX",
   "Description": "Nutanix Inc Class A"
 },
 {
   "Symbol": "HOG",
   "Description": "Harley Davidson Inc"
 },
 {
   "Symbol": "NFG",
   "Description": "National Fuel Gas"
 },
 {
   "Symbol": "GNTX",
   "Description": "Gentex Corp"
 },
 {
   "Symbol": "EXAS",
   "Description": "Exact Sciences Corp"
 },
 {
   "Symbol": "FLO",
   "Description": "Flowers Foods Inc"
 },
 {
   "Symbol": "AN",
   "Description": "AutoNation Inc"
 },
 {
   "Symbol": "CACC",
   "Description": "Credit Acceptance Corp"
 },
 {
   "Symbol": "PII",
   "Description": "Polaris Industries Inc"
 },
 {
   "Symbol": "RH",
   "Description": "RH"
 },
 {
   "Symbol": "TW",
   "Description": "Tradeweb Markets Inc. - Class A"
 },
 {
   "Symbol": "QDEL",
   "Description": "Quidel Corp"
 },
 {
   "Symbol": "AYI",
   "Description": "Acuity Brands Inc"
 },
 {
   "Symbol": "AIRC",
   "Description": "Apartment Income REIT Corp."
 },
 {
   "Symbol": "MDU",
   "Description": "MDU Resources Group Inc"
 },
 {
   "Symbol": "INGR",
   "Description": "Ingredion Inc"
 },
 {
   "Symbol": "SAIC",
   "Description": "Science Applications International"
 },
 {
   "Symbol": "MTZ",
   "Description": "Mastec Inc"
 },
 {
   "Symbol": "NVT",
   "Description": "Nvent Electric Plc"
 },
 {
   "Symbol": "LAD",
   "Description": "Lithia Motors Inc Class A"
 },
 {
   "Symbol": "XPO",
   "Description": "XPO Logistics Inc"
 },
 {
   "Symbol": "VAC",
   "Description": "Marriott Vacations Worldwide Corp"
 },
 {
   "Symbol": "SNV",
   "Description": "Synovus Financial Corp"
 },
 {
   "Symbol": "M",
   "Description": "Macys Inc."
 },
 {
   "Symbol": "COTY",
   "Description": "Coty Inc Class A"
 },
 {
   "Symbol": "VRT",
   "Description": "Vertiv Holdings LLC Class A"
 },
 {
   "Symbol": "OSK",
   "Description": "Oshkosh Corp"
 },
 {
   "Symbol": "ASH",
   "Description": "Ashland Global Inc"
 },
 {
   "Symbol": "PPC",
   "Description": "Pilgrims Pride Corp"
 },
 {
   "Symbol": "CCCS",
   "Description": "CCC Intelligent Solutions Holdings Inc."
 },
 {
   "Symbol": "WTFC",
   "Description": "Wintrust Financial Corp"
 },
 {
   "Symbol": "FYBR",
   "Description": "Frontier Communications Parent Inc."
 },
 {
   "Symbol": "DTM",
   "Description": "DT Midstream Inc."
 },
 {
   "Symbol": "HUN",
   "Description": "Huntsman Corp"
 },
 {
   "Symbol": "CR",
   "Description": "Crane"
 },
 {
   "Symbol": "ALK",
   "Description": "Alaska Air Group Inc"
 },
 {
   "Symbol": "NVST",
   "Description": "Envista Holdings Corporation"
 },
 {
   "Symbol": "LSTR",
   "Description": "Landstar System Inc"
 },
 {
   "Symbol": "DNB",
   "Description": "Dun & Bradstreet Holdings Inc."
 },
 {
   "Symbol": "PYCR",
   "Description": "Paycor HCM Inc"
 },
 {
   "Symbol": "LFUS",
   "Description": "Littelfuse Inc"
 },
 {
   "Symbol": "WWD",
   "Description": "Woodward Inc"
 },
 {
   "Symbol": "POST",
   "Description": "Post Holdings Inc"
 },
 {
   "Symbol": "WU",
   "Description": "Western Union"
 },
 {
   "Symbol": "BLD",
   "Description": "Topbuild Corp"
 },
 {
   "Symbol": "SWCH",
   "Description": "Switch Inc. Class A"
 },
 {
   "Symbol": "PRGO",
   "Description": "Perrigo Plc"
 },
 {
   "Symbol": "APP",
   "Description": "Applovin Corp"
 },
 {
   "Symbol": "BPOP",
   "Description": "Popular Inc"
 },
 {
   "Symbol": "EXEL",
   "Description": "Exelixis Inc"
 },
 {
   "Symbol": "BC",
   "Description": "Brunswick Corp"
 },
 {
   "Symbol": "NATI",
   "Description": "National Instruments Corp"
 },
 {
   "Symbol": "BEPC",
   "Description": "Brookfield Renewable Corporation Class A"
 },
 {
   "Symbol": "AXTA",
   "Description": "Axalta Coating Systems Ltd"
 },
 {
   "Symbol": "SITE",
   "Description": "Siteone Landscape Supply Inc"
 },
 {
   "Symbol": "TREX",
   "Description": "Trex Inc"
 },
 {
   "Symbol": "EHC",
   "Description": "Encompass Health Corp"
 },
 {
   "Symbol": "PLNT",
   "Description": "Planet Fitness Inc Class A"
 },
 {
   "Symbol": "PRI",
   "Description": "Primerica Inc"
 },
 {
   "Symbol": "SGFY",
   "Description": "Signify Health Inc."
 },
 {
   "Symbol": "DRVN",
   "Description": "Driven Brands Holdings Inc."
 },
 {
   "Symbol": "SLGN",
   "Description": "Silgan Holdings Inc"
 },
 {
   "Symbol": "SRC",
   "Description": "Spirit Realty Capital Inc"
 },
 {
   "Symbol": "FAF",
   "Description": "First American Financial Corp"
 },
 {
   "Symbol": "IDA",
   "Description": "IDACORP Inc."
 },
 {
   "Symbol": "MSA",
   "Description": "MSA Safety Inc"
 },
 {
   "Symbol": "VVV",
   "Description": "Valvoline Inc"
 },
 {
   "Symbol": "BWXT",
   "Description": "BWX Technologies Inc"
 },
 {
   "Symbol": "SYNH",
   "Description": "Syneos Health Inc"
 },
 {
   "Symbol": "X",
   "Description": "United States Steel Corporation"
 },
 {
   "Symbol": "LYFT",
   "Description": "Lyft Inc. - Class A"
 },
 {
   "Symbol": "OZK",
   "Description": "Bank of the Ozarks"
 },
 {
   "Symbol": "IAA",
   "Description": "IAA Inc."
 },
 {
   "Symbol": "THG",
   "Description": "Hanover Insurance Group Inc"
 },
 {
   "Symbol": "TKR",
   "Description": "Timken"
 },
 {
   "Symbol": "DV",
   "Description": "DoubleVerify Holdings Inc."
 },
 {
   "Symbol": "PENN",
   "Description": "Penn National Gaming Inc"
 },
 {
   "Symbol": "LITE",
   "Description": "Lumentum Holdings Inc"
 },
 {
   "Symbol": "KRC",
   "Description": "Kilroy Realty Corporation"
 },
 {
   "Symbol": "FCN",
   "Description": "FTI Consulting Inc"
 },
 {
   "Symbol": "FNB",
   "Description": "FNB Corp"
 },
 {
   "Symbol": "SOFI",
   "Description": "SoFi Technologies Inc."
 },
 {
   "Symbol": "RYN",
   "Description": "Rayonier Inc"
 },
 {
   "Symbol": "TOL",
   "Description": "Toll Brothers Inc"
 },
 {
   "Symbol": "GWRE",
   "Description": "Guidewire Software Inc"
 },
 {
   "Symbol": "GH",
   "Description": "Guardant Health Inc"
 },
 {
   "Symbol": "CABO",
   "Description": "Cable One Inc"
 },
 {
   "Symbol": "OSH",
   "Description": "Oak Street Health Inc."
 },
 {
   "Symbol": "S",
   "Description": "SentinelOne Inc."
 },
 {
   "Symbol": "AMG",
   "Description": "Affiliated Managers Group Inc"
 },
 {
   "Symbol": "WIX",
   "Description": "Wix.Com Ltd"
 },
 {
   "Symbol": "AFRM",
   "Description": "Affirm Holdings Inc."
 },
 {
   "Symbol": "NYT",
   "Description": "New York Times Class A"
 },
 {
   "Symbol": "RUN",
   "Description": "Sunrun Inc"
 },
 {
   "Symbol": "CHPT",
   "Description": "ChargePoint Holdings Inc."
 },
 {
   "Symbol": "COHR",
   "Description": "Coherent Inc"
 },
 {
   "Symbol": "COLM",
   "Description": "Columbia Sportswear"
 },
 {
   "Symbol": "TPX",
   "Description": "Tempur Sealy International Inc"
 },
 {
   "Symbol": "TDOC",
   "Description": "Teladoc Inc"
 },
 {
   "Symbol": "THC",
   "Description": "Tenet Healthcare Corp"
 },
 {
   "Symbol": "SMAR",
   "Description": "Smartsheet Inc. Class A"
 },
 {
   "Symbol": "OLED",
   "Description": "Universal Display Corp"
 },
 {
   "Symbol": "H",
   "Description": "Hyatt Hotels Corp Class A"
 },
 {
   "Symbol": "ALGM",
   "Description": "Allegro MicroSystems Inc."
 },
 {
   "Symbol": "HXL",
   "Description": "Hexcel Corp"
 },
 {
   "Symbol": "INFA",
   "Description": "Informatica Inc."
 },
 {
   "Symbol": "NTRA",
   "Description": "Natera Inc"
 },
 {
   "Symbol": "EXP",
   "Description": "Eagle Materials Inc"
 },
 {
   "Symbol": "MKSI",
   "Description": "MKS Instruments Inc"
 },
 {
   "Symbol": "VNO",
   "Description": "Vornado Realty Trust"
 },
 {
   "Symbol": "DISH",
   "Description": "Dish Network Corp Class A"
 },
 {
   "Symbol": "OMF",
   "Description": "Onemain Holdings Inc"
 },
 {
   "Symbol": "SKX",
   "Description": "Skechers USA Inc"
 },
 {
   "Symbol": "LEG",
   "Description": "Leggett & Platt Inc"
 },
 {
   "Symbol": "WEN",
   "Description": "Wendys"
 },
 {
   "Symbol": "CC",
   "Description": "Chemours Company"
 },
 {
   "Symbol": "GXO",
   "Description": "GXO Logistics Inc."
 },
 {
   "Symbol": "SEB",
   "Description": "Seaboard Corp"
 },
 {
   "Symbol": "LPX",
   "Description": "Louisiana Pacific Corp"
 },
 {
   "Symbol": "ESI",
   "Description": "Element Solutions Inc."
 },
 {
   "Symbol": "THO",
   "Description": "Thor Industries Inc"
 },
 {
   "Symbol": "AXS",
   "Description": "Axis Capital Holdings Ltd"
 },
 {
   "Symbol": "IPGP",
   "Description": "IPG Photonics Corp"
 },
 {
   "Symbol": "DLB",
   "Description": "Dolby Laboratories Inc Class A"
 },
 {
   "Symbol": "EEFT",
   "Description": "Euronet Worldwide Inc"
 },
 {
   "Symbol": "FIVN",
   "Description": "Five9 Incinary"
 },
 {
   "Symbol": "UNVR",
   "Description": "Univar Solutions Inc."
 },
 {
   "Symbol": "LAZ",
   "Description": "Lazard LTD."
 },
 {
   "Symbol": "UMPQ",
   "Description": "Umpqua Holdings Corp"
 },
 {
   "Symbol": "IART",
   "Description": "Integra Lifesciences Holdings Corp"
 },
 {
   "Symbol": "R",
   "Description": "Ryder System Inc"
 },
 {
   "Symbol": "IAC",
   "Description": "IAC/InterActive"
 },
 {
   "Symbol": "RL",
   "Description": "Ralph Lauren Corp Class A"
 },
 {
   "Symbol": "OWL",
   "Description": "Blue Owl Capital Inc. Class A"
 },
 {
   "Symbol": "PINC",
   "Description": "Premier Inc Class A"
 },
 {
   "Symbol": "NYCB",
   "Description": "New York Community Bancorp"
 },
 {
   "Symbol": "AGNC",
   "Description": "AGNC Investment Corp"
 },
 {
   "Symbol": "NEWR",
   "Description": "New Relic Inc"
 },
 {
   "Symbol": "SLM",
   "Description": "Sallie Mae"
 },
 {
   "Symbol": "HE",
   "Description": "Hawaiian Electric Industries Inc"
 },
 {
   "Symbol": "MTG",
   "Description": "MGIC Investment Corp"
 },
 {
   "Symbol": "PLTK",
   "Description": "Playtika Holding Corp."
 },
 {
   "Symbol": "KEX",
   "Description": "Kirby Corp"
 },
 {
   "Symbol": "WTM",
   "Description": "White Mountains Insurance Group Ltd"
 },
 {
   "Symbol": "GPS",
   "Description": "Gap Inc"
 },
 {
   "Symbol": "SRCL",
   "Description": "Stericycle Inc"
 },
 {
   "Symbol": "COUP",
   "Description": "Coupa Software Inc"
 },
 {
   "Symbol": "ALSN",
   "Description": "Allison Transmission Holdings Inc"
 },
 {
   "Symbol": "EVR",
   "Description": "Evercore Inc. Class A"
 },
 {
   "Symbol": "MAN",
   "Description": "Manpower Inc"
 },
 {
   "Symbol": "BHF",
   "Description": "Brighthouse Financial"
 },
 {
   "Symbol": "SAM",
   "Description": "Boston Beer Inc Class A"
 },
 {
   "Symbol": "CNM",
   "Description": "Core & Main Inc."
 },
 {
   "Symbol": "AL",
   "Description": "Air Lease Corp"
 },
 {
   "Symbol": "MSM",
   "Description": "MSC Industrial Inc Class A"
 },
 {
   "Symbol": "CFLT",
   "Description": "Confluent Inc."
 },
 {
   "Symbol": "NSA",
   "Description": "National Storage Affiliates Trust"
 },
 {
   "Symbol": "RITM",
   "Description": "Rithm Capital Corp."
 },
 {
   "Symbol": "JHG",
   "Description": "Janus Henderson Group Plc"
 },
 {
   "Symbol": "TFSL",
   "Description": "TFS Financial Corp"
 },
 {
   "Symbol": "MRTX",
   "Description": "Mirati Therapeutics Inc"
 },
 {
   "Symbol": "AVT",
   "Description": "Avnet Inc"
 },
 {
   "Symbol": "BFAM",
   "Description": "Bright Horizons Family Solutions"
 },
 {
   "Symbol": "FLS",
   "Description": "Flowserve Corp"
 },
 {
   "Symbol": "CRUS",
   "Description": "Cirrus Logic Inc"
 },
 {
   "Symbol": "ICUI",
   "Description": "ICU Medical Inc"
 },
 {
   "Symbol": "OLLI",
   "Description": "Ollies Bargain Outlet Holdings Inc"
 },
 {
   "Symbol": "AGO",
   "Description": "Assured Guaranty Ltd"
 },
 {
   "Symbol": "CUZ",
   "Description": "Cousins Properties Incorporated"
 },
 {
   "Symbol": "KSS",
   "Description": "Kohls Corporation"
 },
 {
   "Symbol": "NCNO",
   "Description": "nCino Inc."
 },
 {
   "Symbol": "TNDM",
   "Description": "Tandem Diabetes Care Inc"
 },
 {
   "Symbol": "AWI",
   "Description": "Armstrong World Industries Inc"
 },
 {
   "Symbol": "WWE",
   "Description": "World Wrestling Entertainment Inc"
 },
 {
   "Symbol": "AZTA",
   "Description": "Azenta Inc."
 },
 {
   "Symbol": "AMC",
   "Description": "AMC Entertainment Holdings Inc Class A"
 },
 {
   "Symbol": "PVH",
   "Description": "PVH Corp"
 },
 {
   "Symbol": "GO",
   "Description": "Grocery Outlet Holding Corp."
 },
 {
   "Symbol": "TDC",
   "Description": "Teradata Corp"
 },
 {
   "Symbol": "FHB",
   "Description": "First Hawaiian Inc"
 },
 {
   "Symbol": "JWN",
   "Description": "Nordstrom Inc"
 },
 {
   "Symbol": "GTES",
   "Description": "Gates Industrial Corporation Plc"
 },
 {
   "Symbol": "TNL",
   "Description": "Travel & Leisure Co."
 },
 {
   "Symbol": "VSCO",
   "Description": "Victorias Secret & Co."
 },
 {
   "Symbol": "DEI",
   "Description": "Douglas Emmett Inc"
 },
 {
   "Symbol": "PK",
   "Description": "Park Hotels & Resorts Inc"
 },
 {
   "Symbol": "AYX",
   "Description": "Alteryx Inc Class A"
 },
 {
   "Symbol": "VNT",
   "Description": "Vontier Corporation"
 },
 {
   "Symbol": "AMED",
   "Description": "Amedisys Inc"
 },
 {
   "Symbol": "PEGA",
   "Description": "Pegasystems Inc"
 },
 {
   "Symbol": "MSGS",
   "Description": "Madison Square Garden Sports Corp. Class A"
 },
 {
   "Symbol": "HHC",
   "Description": "Howard Hughes Corp"
 },
 {
   "Symbol": "VSAT",
   "Description": "Viasat Inc"
 },
 {
   "Symbol": "TRIP",
   "Description": "TripAdvisor Inc"
 },
 {
   "Symbol": "BOH",
   "Description": "Bank Of Hawaii Corp."
 },
 {
   "Symbol": "ATUS",
   "Description": "Altice USA Inc. Class A"
 },
 {
   "Symbol": "NEU",
   "Description": "Newmarket Corp"
 },
 {
   "Symbol": "HIW",
   "Description": "Highwoods Properties Inc"
 },
 {
   "Symbol": "SSRM",
   "Description": "SSR Mining Inc."
 },
 {
   "Symbol": "KMPR",
   "Description": "Kemper Corp"
 },
 {
   "Symbol": "TWKS",
   "Description": "Thoughtworks Holding Inc"
 },
 {
   "Symbol": "DNA",
   "Description": "Ginkgo Bioworks Holdings Inc. Class A"
 },
 {
   "Symbol": "RNG",
   "Description": "Ringcentral Inc Class A"
 },
 {
   "Symbol": "EPR",
   "Description": "EPR Properties"
 },
 {
   "Symbol": "CRI",
   "Description": "Carters Inc"
 },
 {
   "Symbol": "PACW",
   "Description": "Pacwest Bancorp"
 },
 {
   "Symbol": "DOCS",
   "Description": "Doximity Inc."
 }
 
 ]
 }
 """