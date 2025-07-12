async function CustomFetch(url, data, method) {
    try {

      const configuration = {
        method: method,
        headers: {
          'Content-Type': 'application/json',
          'Token': process.env.REACT_APP_API_TOKEN,
        }
      }

      if(method !== "GET" && method !== "DELETE"){
        configuration.body = JSON.stringify(data);
      }

      const response = await fetch(process.env.REACT_APP_API_URL + url, configuration);
  
      const responseData = await response.json();

      return responseData;
    } catch (error) {
        const res = {
          "message" : "Ha ocurrido un error al realizar la solicitud.",
          "status" : "error"
        }

        return res;
    }
  }

  module.exports = {CustomFetch};
